package br.com.tesso.canadasurvey.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.event.map.StateChangeEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.LatLngBounds;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

import br.com.tesso.canadasurvey.entity.SurveyInfo;

@ManagedBean
@ViewScoped
public class SurveyController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<SurveyInfo> listSurveyInfos;

	private MapModel advancedModel;
	private Marker marker;

	private int selectedItem;

	private Float maxValue;
	private Float minValue;
	private Float[][] markersRange;
	
	private LatLng center;
	private int zoomLevel;

	@PostConstruct
	public void carregar() {
		zoomLevel = 4;
		center = new LatLng(new Float("56.2906375105966"), new Float("-93.56330025"));
		
		advancedModel = new DefaultMapModel();
		
		InputStream csv = SurveyController.class
				.getResourceAsStream("/../../../../../survey.tsv");
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "	";

		if (csv == null) {
			System.out.println("Nao acho arquivo!!");
			return;
		}
		try {

			br = new BufferedReader(new InputStreamReader(csv, "UTF-8"));

			listSurveyInfos = new ArrayList<SurveyInfo>();

			while ((line = br.readLine()) != null) {
				SurveyInfo survey = new SurveyInfo();
				// use TAB as separator
				String[] data = line.split(cvsSplitBy);

				//System.out.println("City [name= " + data[1] + " , Population=" + data[2] + "]");

				survey.setRank(new Integer(data[0]));
				survey.setName(data[1]);
				survey.setPopulation(new Float(data[2]));
				survey.setPopulationGrowth(new Float(data[3].replace("%", "")));
				survey.setUnemploymentRate(new Float(data[4]));
				survey.setAverageHouseholdIncome(new BigDecimal(data[5]
						.replace(",", "").replace("$", "")));
				
				
				if (data.length > 30) {
					survey.setLatitude(new Float(data[30]));
					survey.setLongitude(new Float(data[31]));
				}
				listSurveyInfos.add(survey);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
	}
	


	public void refreshMap() throws Exception{

		advancedModel = new DefaultMapModel();

		calculateMaxMin();
		prepareMarkersRanges();

		for (SurveyInfo s : listSurveyInfos) {
			if (s.getLatitude() != null && s.getLongitude() != null && s.isSelected()) {
				LatLng coord = new LatLng(s.getLatitude(), s.getLongitude());
				advancedModel.addOverlay(new Marker(coord, s.getName(), getText(s), getProperMarker(s)));
				System.out.println("Marker Placed at " + s.getName());
			}
		}
	}

	private String getText(SurveyInfo s) {
		String str = null;
		if (selectedItem == 1) {
			str = "POPULATION: ";
		} else if (selectedItem == 2) {
			str ="POPULATION GROWTH 2008 TO 2013 (%): ";
		} else if (selectedItem == 3)
			str = "UNEMPLOYMENT RATE (%): ";
			return str + getValueFromSurveyItem(s).toString();			
	}

	private String getProperMarker(SurveyInfo s) {
		Float value = 0f;

		value = getValueFromSurveyItem(s);

		if (markersRange[0][0] <= value && markersRange[0][1] >= value) {
			return "icons/yellow-dot.png";
		}
		
		if (markersRange[1][0] <= value && markersRange[1][1] >= value) {
			return "icons/blue-dot.png";
		}
		
		if (markersRange[2][0] <= value && markersRange[2][1] >= value) {
			return "icons/green-dot.png";
		}
		
		if (markersRange[3][0] <= value && markersRange[3][1] >= value) {
			return "icons/purple-dot.png";
		}
		
		if (markersRange[4][0] <= value && markersRange[4][1] >= value) {
			return "icons/red-dot.png";
		}
		return "";

	}



	/**
	 * @param s
	 * @return
	 */
	private Float getValueFromSurveyItem(SurveyInfo s) {
		if (selectedItem == 1) 
			return new Float(s.getPopulation());
		else if (selectedItem == 2)
			return new Float(s.getPopulationGrowth());
		else if (selectedItem == 3)
			return new Float(s.getUnemploymentRate());
		else
			return null;
	}

	private void prepareMarkersRanges() {
		markersRange = new Float[5][2];

		Float markerLength = maxValue - minValue;
		Float range = markerLength / 5;

		markersRange[0][0] = minValue;
		markersRange[0][1] = minValue + range;

		markersRange[1][0] = markersRange[0][1];
		markersRange[1][1] = markersRange[1][0] + range;

		markersRange[2][0] = markersRange[1][1];
		markersRange[2][1] = markersRange[2][0] + range;

		markersRange[3][0] = markersRange[2][1];
		markersRange[3][1] = markersRange[3][0] + range;

		markersRange[4][0] = markersRange[3][1];
		markersRange[4][1] = maxValue;

	}
	
	public void updateCities() throws Exception{
		for (SurveyInfo s : listSurveyInfos) {
			if(s.isSelected()) 
				System.out.println(s.getName() + " Selected");
				
		}
		
	}

	private void calculateMaxMin() {

		maxValue = 0f;
		minValue = 0f;

		if (selectedItem > 0) 
			for (SurveyInfo s : listSurveyInfos) 
				if(s.isSelected()) 
					setMaxnMin(getValueFromSurveyItem(s));

	}

	private void setMaxnMin(Float value) {
		if (value.compareTo(maxValue) > 0 || maxValue.equals(0f))
			maxValue = value;
		if (value.compareTo(minValue) < 0 || minValue.equals(0f))
			minValue = value;

	}
	
	public void onStateChange(StateChangeEvent event) {
        this.center = event.getCenter();
        this.zoomLevel = event.getZoomLevel();
        System.out.println("zoom: "+this.zoomLevel + " | " + center.getLat() +","+center.getLng() );
	}
	
	public void onMarkerSelect(OverlaySelectEvent event) {
        marker = (Marker) event.getOverlay();
    }
     
    public Marker getMarker() {
        return marker;
    }

	public List<SurveyInfo> getListSurveyInfos() {
		return listSurveyInfos;
	}

	public void setListSurveyInfos(List<SurveyInfo> listSurveyInfos) {
		this.listSurveyInfos = listSurveyInfos;
	}

	public MapModel getAdvancedModel() {
		return advancedModel;
	}

	public int getSelectedItem() {
		return selectedItem;
	}

	public void setSelectedItem(int selectedItem) {
		this.selectedItem = selectedItem;
	}

	public Float getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Float maxValue) {
		this.maxValue = maxValue;
	}

	public Float getMinValue() {
		return minValue;
	}

	public void setMinValue(Float minValue) {
		this.minValue = minValue;
	}

	public Float[][] getMarkersRange() {
		return markersRange;
	}

	public void setMarkersRange(Float[][] markersRange) {
		this.markersRange = markersRange;
	}

	public LatLng getCenter() {
		return center;
	}

	public void setCenter(LatLng center) {
		this.center = center;
	}

	public int getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
	
	

}
