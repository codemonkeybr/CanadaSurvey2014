package br.com.tesso.canadasurvey.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

import br.com.tesso.canadasurvey.entity.SurveyInfo;


@ManagedBean
@ViewScoped
public class SurveyController {
	
	private List<SurveyInfo> listSurveyInfos;
	
	
	private MapModel advancedModel;
	
	public SurveyController(){
		
		
		//advancedModel.addOverlay(new Marker);
	}
	
	@PostConstruct
	public void carregar(){
		
		InputStream csv = 
				SurveyController.class.getResourceAsStream("/../../../../../survey.tsv");
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "	";
		
		if(csv == null){
			System.out.println("Nao acho arquivo!!");
			return;
		}
		try {
	 
			br = new BufferedReader(new InputStreamReader(csv,"UTF-8"));
			
			listSurveyInfos = new ArrayList<SurveyInfo>();
			
			while ((line = br.readLine()) != null) {
				SurveyInfo survey = new SurveyInfo();
			        // use comma as separator
				String[] data = line.split(cvsSplitBy);
	 
				System.out.println("City [name= " + data[1] 
	                                 + " , Population=" + data[2] + "]");
				
				survey.setRank(new Integer(data[0]));
				survey.setName(data[1]);
				survey.setPopulation(new Float(data[2]));
				survey.setPopulationGrowth(new Float(data[3].replace("%", "")));
				survey.setUnemploymentRate(new Float(data[4]));
				survey.setAverageHouseholdIncome(new BigDecimal(data[5].replace(",", "").replace("$", "")));
				if(data.length > 30) {
					survey.setLatitude(new Float(data[30]));
					survey.setLongitude(new Float(data[31]));
				}
				listSurveyInfos.add(survey);
			}
			
			advancedModel = new DefaultMapModel();
			LatLng coord1 = new LatLng(listSurveyInfos.get(0).getLatitude(), listSurveyInfos.get(0).getLongitude());
			advancedModel.addOverlay(new Marker(coord1, listSurveyInfos.get(0).getName()));
	 
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

	public List<SurveyInfo> getListSurveyInfos() {
		return listSurveyInfos;
	}

	public void setListSurveyInfos(List<SurveyInfo> listSurveyInfos) {
		this.listSurveyInfos = listSurveyInfos;
	}

	public MapModel getAdvancedModel() {
		return advancedModel;
	}

	public void setAdvancedModel(MapModel advancedModel) {
		this.advancedModel = advancedModel;
	}
	
	

}
