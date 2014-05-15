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
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
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

	@PostConstruct
	public void carregar() {
		
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
				// use comma as separator
				String[] data = line.split(cvsSplitBy);

				System.out.println("City [name= " + data[1] + " , Population="
						+ data[2] + "]");

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
	


	public void atualizaMapa() throws Exception{

		advancedModel = new DefaultMapModel();

		calculateMaxMin();
		prepareMarkersRanges();

		for (SurveyInfo s : listSurveyInfos) {
			if (s.getLatitude() != null && s.getLongitude() != null) {
				LatLng coord1 = new LatLng(s.getLatitude(), s.getLongitude());
				advancedModel.addOverlay(new Marker(coord1, s.getName(), getText(s), getProperMarker(s)));
				System.out.println("Marker Placed at " + s.getName());
			}
		}
	}

	private String getText(SurveyInfo s) {
		if (selectedItem == 1) {
			return "Population: "+s.getPopulation().toString();
		}
		return "";
	}

	private String getProperMarker(SurveyInfo s) {
		Float value = 0f;

		if (selectedItem == 1) {
			value = new Float(s.getPopulation());
		}

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

	private void prepareMarkersRanges() {
		markersRange = new Float[5][2];

		Float markerLength = maxValue - minValue;
		Float maxRange = markerLength / 5;

		markersRange[0][0] = minValue;
		markersRange[0][1] = maxRange;

		markersRange[1][0] = markersRange[0][1] + 1;
		markersRange[1][1] = maxRange * 2;

		markersRange[2][0] = markersRange[1][1];
		markersRange[2][1] = maxRange * 3;

		markersRange[3][0] = markersRange[2][1];
		markersRange[3][1] = maxRange * 4;

		markersRange[4][0] = markersRange[3][1] + 1;
		markersRange[4][1] = maxValue;

	}

	private void calculateMaxMin() {

		maxValue = 0f;
		minValue = 0f;

		if (selectedItem == 1) {
			for (SurveyInfo s : listSurveyInfos) {
				getMaxnMin(s.getPopulation());
			}

		}

	}

	private void getMaxnMin(Float value) {
		if (value.compareTo(maxValue) > 0 || maxValue.equals(0f))
			maxValue = value;
		if (value.compareTo(minValue) < 0 || minValue.equals(0f))
			minValue = value;

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

}
