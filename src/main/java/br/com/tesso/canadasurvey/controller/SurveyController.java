package br.com.tesso.canadasurvey.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import br.com.tesso.canadasurvey.entity.SurveyInfo;


@ManagedBean
@ViewScoped
public class SurveyController {
	
	private List<SurveyInfo> listSurveyInfos;
	
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
	 
				System.out.println("City [code= " + data[1] 
	                                 + " , name=" + data[5] + "]");
				
				survey.setRank(new Integer(data[0]));
				survey.setName(data[1]);
				survey.setPopulation(new Float(data[2]));
				
	 
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

}
