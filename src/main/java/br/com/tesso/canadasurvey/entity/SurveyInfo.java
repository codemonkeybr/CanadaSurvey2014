package br.com.tesso.canadasurvey.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class SurveyInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer rank;
	private String name;
	private Float population;
	private Float populationGrowth;
	private Float unemploymentRate;
	private BigDecimal averageHouseholdIncome;
	private BigDecimal averageHouseholdNetworth;
	private BigDecimal averageHousePrice;
	private Float averageYearsToBuyHouse;
	private BigDecimal averagePropertyTax;
	private Float salesTax;
	private Float incomeTax;
	private Float newCars;
	private Float walkToWork;
	private Float bikeToWork;
	private Float takePublicTransportToWork;
	private Float totalRainfall;
	private Float daysPerYearWithPrecipitation;
	private Float daysPerYearWithRain;
	private Float daysAboveZeroCelsius;
	private Float daysAboveTwentyCelsius;
	private Float daysBelowMinusTwentyCelsius;
	private Float meanDailyTemp;
	private Float daysAboveTwentyFourCelsius;
	private Float fiveYearChangeInCrimeRate;
	private Float crimeRatePer100000;
	private Float crimeSeverityIndex;
	private Float violentCrimeSeverityIndex;
	private Float numberOfMedicalOfficesPerThousant;
	private Float doctorsPerThousant;
	
	private Float latitude;
	private Float longitude;
	
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPopulation() {
		return population;
	}
	public void setPopulation(Float population) {
		this.population = population;
	}
	public Float getPopulationGrowth() {
		return populationGrowth;
	}
	public void setPopulationGrowth(Float populationGrowth) {
		this.populationGrowth = populationGrowth;
	}
	public Float getUnemploymentRate() {
		return unemploymentRate;
	}
	public void setUnemploymentRate(Float unemploymentRate) {
		this.unemploymentRate = unemploymentRate;
	}
	public BigDecimal getAverageHouseholdIncome() {
		return averageHouseholdIncome;
	}
	public void setAverageHouseholdIncome(BigDecimal averageHouseholdIncome) {
		this.averageHouseholdIncome = averageHouseholdIncome;
	}
	public BigDecimal getAverageHouseholdNetworth() {
		return averageHouseholdNetworth;
	}
	public void setAverageHouseholdNetworth(BigDecimal averageHouseholdNetworth) {
		this.averageHouseholdNetworth = averageHouseholdNetworth;
	}
	public BigDecimal getAverageHousePrice() {
		return averageHousePrice;
	}
	public void setAverageHousePrice(BigDecimal averageHousePrice) {
		this.averageHousePrice = averageHousePrice;
	}
	public Float getAverageYearsToBuyHouse() {
		return averageYearsToBuyHouse;
	}
	public void setAverageYearsToBuyHouse(Float averageYearsToBuyHouse) {
		this.averageYearsToBuyHouse = averageYearsToBuyHouse;
	}
	public BigDecimal getAveragePropertyTax() {
		return averagePropertyTax;
	}
	public void setAveragePropertyTax(BigDecimal averagePropertyTax) {
		this.averagePropertyTax = averagePropertyTax;
	}
	public Float getSalesTax() {
		return salesTax;
	}
	public void setSalesTax(Float salesTax) {
		this.salesTax = salesTax;
	}
	public Float getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(Float incomeTax) {
		this.incomeTax = incomeTax;
	}
	public Float getNewCars() {
		return newCars;
	}
	public void setNewCars(Float newCars) {
		this.newCars = newCars;
	}
	public Float getWalkToWork() {
		return walkToWork;
	}
	public void setWalkToWork(Float walkToWork) {
		this.walkToWork = walkToWork;
	}
	public Float getBikeToWork() {
		return bikeToWork;
	}
	public void setBikeToWork(Float bikeToWork) {
		this.bikeToWork = bikeToWork;
	}
	public Float getTakePublicTransportToWork() {
		return takePublicTransportToWork;
	}
	public void setTakePublicTransportToWork(Float takePublicTransportToWork) {
		this.takePublicTransportToWork = takePublicTransportToWork;
	}
	public Float getTotalRainfall() {
		return totalRainfall;
	}
	public void setTotalRainfall(Float totalRainfall) {
		this.totalRainfall = totalRainfall;
	}
	public Float getDaysPerYearWithPrecipitation() {
		return daysPerYearWithPrecipitation;
	}
	public void setDaysPerYearWithPrecipitation(Float daysPerYearWithPrecipitation) {
		this.daysPerYearWithPrecipitation = daysPerYearWithPrecipitation;
	}
	public Float getDaysPerYearWithRain() {
		return daysPerYearWithRain;
	}
	public void setDaysPerYearWithRain(Float daysPerYearWithRain) {
		this.daysPerYearWithRain = daysPerYearWithRain;
	}
	public Float getDaysAboveZeroCelsius() {
		return daysAboveZeroCelsius;
	}
	public void setDaysAboveZeroCelsius(Float daysAboveZeroCelsius) {
		this.daysAboveZeroCelsius = daysAboveZeroCelsius;
	}
	public Float getDaysAboveTwentyCelsius() {
		return daysAboveTwentyCelsius;
	}
	public void setDaysAboveTwentyCelsius(Float daysAboveTwentyCelsius) {
		this.daysAboveTwentyCelsius = daysAboveTwentyCelsius;
	}
	public Float getDaysBelowMinusTwentyCelsius() {
		return daysBelowMinusTwentyCelsius;
	}
	public void setDaysBelowMinusTwentyCelsius(Float daysBelowMinusTwentyCelsius) {
		this.daysBelowMinusTwentyCelsius = daysBelowMinusTwentyCelsius;
	}
	public Float getMeanDailyTemp() {
		return meanDailyTemp;
	}
	public void setMeanDailyTemp(Float meanDailyTemp) {
		this.meanDailyTemp = meanDailyTemp;
	}
	public Float getDaysAboveTwentyFourCelsius() {
		return daysAboveTwentyFourCelsius;
	}
	public void setDaysAboveTwentyFourCelsius(Float daysAboveTwentyFourCelsius) {
		this.daysAboveTwentyFourCelsius = daysAboveTwentyFourCelsius;
	}
	public Float getFiveYearChangeInCrimeRate() {
		return fiveYearChangeInCrimeRate;
	}
	public void setFiveYearChangeInCrimeRate(Float fiveYearChangeInCrimeRate) {
		this.fiveYearChangeInCrimeRate = fiveYearChangeInCrimeRate;
	}
	public Float getCrimeRatePer100000() {
		return crimeRatePer100000;
	}
	public void setCrimeRatePer100000(Float crimeRatePer100000) {
		this.crimeRatePer100000 = crimeRatePer100000;
	}
	public Float getCrimeSeverityIndex() {
		return crimeSeverityIndex;
	}
	public void setCrimeSeverityIndex(Float crimeSeverityIndex) {
		this.crimeSeverityIndex = crimeSeverityIndex;
	}
	public Float getViolentCrimeSeverityIndex() {
		return violentCrimeSeverityIndex;
	}
	public void setViolentCrimeSeverityIndex(Float violentCrimeSeverityIndex) {
		this.violentCrimeSeverityIndex = violentCrimeSeverityIndex;
	}
	public Float getNumberOfMedicalOfficesPerThousant() {
		return numberOfMedicalOfficesPerThousant;
	}
	public void setNumberOfMedicalOfficesPerThousant(
			Float numberOfMedicalOfficesPerThousant) {
		this.numberOfMedicalOfficesPerThousant = numberOfMedicalOfficesPerThousant;
	}
	public Float getDoctorsPerThousant() {
		return doctorsPerThousant;
	}
	public void setDoctorsPerThousant(Float doctorsPerThousant) {
		this.doctorsPerThousant = doctorsPerThousant;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	
}
