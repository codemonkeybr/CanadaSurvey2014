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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((averageHousePrice == null) ? 0 : averageHousePrice
						.hashCode());
		result = prime
				* result
				+ ((averageHouseholdIncome == null) ? 0
						: averageHouseholdIncome.hashCode());
		result = prime
				* result
				+ ((averageHouseholdNetworth == null) ? 0
						: averageHouseholdNetworth.hashCode());
		result = prime
				* result
				+ ((averagePropertyTax == null) ? 0 : averagePropertyTax
						.hashCode());
		result = prime
				* result
				+ ((averageYearsToBuyHouse == null) ? 0
						: averageYearsToBuyHouse.hashCode());
		result = prime * result
				+ ((bikeToWork == null) ? 0 : bikeToWork.hashCode());
		result = prime
				* result
				+ ((crimeRatePer100000 == null) ? 0 : crimeRatePer100000
						.hashCode());
		result = prime
				* result
				+ ((crimeSeverityIndex == null) ? 0 : crimeSeverityIndex
						.hashCode());
		result = prime
				* result
				+ ((daysAboveTwentyCelsius == null) ? 0
						: daysAboveTwentyCelsius.hashCode());
		result = prime
				* result
				+ ((daysAboveTwentyFourCelsius == null) ? 0
						: daysAboveTwentyFourCelsius.hashCode());
		result = prime
				* result
				+ ((daysAboveZeroCelsius == null) ? 0 : daysAboveZeroCelsius
						.hashCode());
		result = prime
				* result
				+ ((daysBelowMinusTwentyCelsius == null) ? 0
						: daysBelowMinusTwentyCelsius.hashCode());
		result = prime
				* result
				+ ((daysPerYearWithPrecipitation == null) ? 0
						: daysPerYearWithPrecipitation.hashCode());
		result = prime
				* result
				+ ((daysPerYearWithRain == null) ? 0 : daysPerYearWithRain
						.hashCode());
		result = prime
				* result
				+ ((doctorsPerThousant == null) ? 0 : doctorsPerThousant
						.hashCode());
		result = prime
				* result
				+ ((fiveYearChangeInCrimeRate == null) ? 0
						: fiveYearChangeInCrimeRate.hashCode());
		result = prime * result
				+ ((incomeTax == null) ? 0 : incomeTax.hashCode());
		result = prime * result
				+ ((meanDailyTemp == null) ? 0 : meanDailyTemp.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((newCars == null) ? 0 : newCars.hashCode());
		result = prime
				* result
				+ ((numberOfMedicalOfficesPerThousant == null) ? 0
						: numberOfMedicalOfficesPerThousant.hashCode());
		result = prime * result
				+ ((population == null) ? 0 : population.hashCode());
		result = prime
				* result
				+ ((populationGrowth == null) ? 0 : populationGrowth.hashCode());
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result
				+ ((salesTax == null) ? 0 : salesTax.hashCode());
		result = prime
				* result
				+ ((takePublicTransportToWork == null) ? 0
						: takePublicTransportToWork.hashCode());
		result = prime * result
				+ ((totalRainfall == null) ? 0 : totalRainfall.hashCode());
		result = prime
				* result
				+ ((unemploymentRate == null) ? 0 : unemploymentRate.hashCode());
		result = prime
				* result
				+ ((violentCrimeSeverityIndex == null) ? 0
						: violentCrimeSeverityIndex.hashCode());
		result = prime * result
				+ ((walkToWork == null) ? 0 : walkToWork.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SurveyInfo other = (SurveyInfo) obj;
		if (averageHousePrice == null) {
			if (other.averageHousePrice != null)
				return false;
		} else if (!averageHousePrice.equals(other.averageHousePrice))
			return false;
		if (averageHouseholdIncome == null) {
			if (other.averageHouseholdIncome != null)
				return false;
		} else if (!averageHouseholdIncome.equals(other.averageHouseholdIncome))
			return false;
		if (averageHouseholdNetworth == null) {
			if (other.averageHouseholdNetworth != null)
				return false;
		} else if (!averageHouseholdNetworth
				.equals(other.averageHouseholdNetworth))
			return false;
		if (averagePropertyTax == null) {
			if (other.averagePropertyTax != null)
				return false;
		} else if (!averagePropertyTax.equals(other.averagePropertyTax))
			return false;
		if (averageYearsToBuyHouse == null) {
			if (other.averageYearsToBuyHouse != null)
				return false;
		} else if (!averageYearsToBuyHouse.equals(other.averageYearsToBuyHouse))
			return false;
		if (bikeToWork == null) {
			if (other.bikeToWork != null)
				return false;
		} else if (!bikeToWork.equals(other.bikeToWork))
			return false;
		if (crimeRatePer100000 == null) {
			if (other.crimeRatePer100000 != null)
				return false;
		} else if (!crimeRatePer100000.equals(other.crimeRatePer100000))
			return false;
		if (crimeSeverityIndex == null) {
			if (other.crimeSeverityIndex != null)
				return false;
		} else if (!crimeSeverityIndex.equals(other.crimeSeverityIndex))
			return false;
		if (daysAboveTwentyCelsius == null) {
			if (other.daysAboveTwentyCelsius != null)
				return false;
		} else if (!daysAboveTwentyCelsius.equals(other.daysAboveTwentyCelsius))
			return false;
		if (daysAboveTwentyFourCelsius == null) {
			if (other.daysAboveTwentyFourCelsius != null)
				return false;
		} else if (!daysAboveTwentyFourCelsius
				.equals(other.daysAboveTwentyFourCelsius))
			return false;
		if (daysAboveZeroCelsius == null) {
			if (other.daysAboveZeroCelsius != null)
				return false;
		} else if (!daysAboveZeroCelsius.equals(other.daysAboveZeroCelsius))
			return false;
		if (daysBelowMinusTwentyCelsius == null) {
			if (other.daysBelowMinusTwentyCelsius != null)
				return false;
		} else if (!daysBelowMinusTwentyCelsius
				.equals(other.daysBelowMinusTwentyCelsius))
			return false;
		if (daysPerYearWithPrecipitation == null) {
			if (other.daysPerYearWithPrecipitation != null)
				return false;
		} else if (!daysPerYearWithPrecipitation
				.equals(other.daysPerYearWithPrecipitation))
			return false;
		if (daysPerYearWithRain == null) {
			if (other.daysPerYearWithRain != null)
				return false;
		} else if (!daysPerYearWithRain.equals(other.daysPerYearWithRain))
			return false;
		if (doctorsPerThousant == null) {
			if (other.doctorsPerThousant != null)
				return false;
		} else if (!doctorsPerThousant.equals(other.doctorsPerThousant))
			return false;
		if (fiveYearChangeInCrimeRate == null) {
			if (other.fiveYearChangeInCrimeRate != null)
				return false;
		} else if (!fiveYearChangeInCrimeRate
				.equals(other.fiveYearChangeInCrimeRate))
			return false;
		if (incomeTax == null) {
			if (other.incomeTax != null)
				return false;
		} else if (!incomeTax.equals(other.incomeTax))
			return false;
		if (meanDailyTemp == null) {
			if (other.meanDailyTemp != null)
				return false;
		} else if (!meanDailyTemp.equals(other.meanDailyTemp))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (newCars == null) {
			if (other.newCars != null)
				return false;
		} else if (!newCars.equals(other.newCars))
			return false;
		if (numberOfMedicalOfficesPerThousant == null) {
			if (other.numberOfMedicalOfficesPerThousant != null)
				return false;
		} else if (!numberOfMedicalOfficesPerThousant
				.equals(other.numberOfMedicalOfficesPerThousant))
			return false;
		if (population == null) {
			if (other.population != null)
				return false;
		} else if (!population.equals(other.population))
			return false;
		if (populationGrowth == null) {
			if (other.populationGrowth != null)
				return false;
		} else if (!populationGrowth.equals(other.populationGrowth))
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		if (salesTax == null) {
			if (other.salesTax != null)
				return false;
		} else if (!salesTax.equals(other.salesTax))
			return false;
		if (takePublicTransportToWork == null) {
			if (other.takePublicTransportToWork != null)
				return false;
		} else if (!takePublicTransportToWork
				.equals(other.takePublicTransportToWork))
			return false;
		if (totalRainfall == null) {
			if (other.totalRainfall != null)
				return false;
		} else if (!totalRainfall.equals(other.totalRainfall))
			return false;
		if (unemploymentRate == null) {
			if (other.unemploymentRate != null)
				return false;
		} else if (!unemploymentRate.equals(other.unemploymentRate))
			return false;
		if (violentCrimeSeverityIndex == null) {
			if (other.violentCrimeSeverityIndex != null)
				return false;
		} else if (!violentCrimeSeverityIndex
				.equals(other.violentCrimeSeverityIndex))
			return false;
		if (walkToWork == null) {
			if (other.walkToWork != null)
				return false;
		} else if (!walkToWork.equals(other.walkToWork))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SurveyInfo [rank=" + rank + ", name=" + name + ", population="
				+ population + ", populationGrowth=" + populationGrowth
				+ ", unemploymentRate=" + unemploymentRate
				+ ", averageHouseholdIncome=" + averageHouseholdIncome
				+ ", averageHouseholdNetworth=" + averageHouseholdNetworth
				+ ", averageHousePrice=" + averageHousePrice
				+ ", averageYearsToBuyHouse=" + averageYearsToBuyHouse
				+ ", averagePropertyTax=" + averagePropertyTax + ", salesTax="
				+ salesTax + ", incomeTax=" + incomeTax + ", newCars="
				+ newCars + ", walkToWork=" + walkToWork + ", bikeToWork="
				+ bikeToWork + ", takePublicTransportToWork="
				+ takePublicTransportToWork + ", totalRainfall="
				+ totalRainfall + ", daysPerYearWithPrecipitation="
				+ daysPerYearWithPrecipitation + ", daysPerYearWithRain="
				+ daysPerYearWithRain + ", daysAboveZeroCelsius="
				+ daysAboveZeroCelsius + ", daysAboveTwentyCelsius="
				+ daysAboveTwentyCelsius + ", daysBelowMinusTwentyCelsius="
				+ daysBelowMinusTwentyCelsius + ", meanDailyTemp="
				+ meanDailyTemp + ", daysAboveTwentyFourCelsius="
				+ daysAboveTwentyFourCelsius + ", fiveYearChangeInCrimeRate="
				+ fiveYearChangeInCrimeRate + ", crimeRatePer100000="
				+ crimeRatePer100000 + ", crimeSeverityIndex="
				+ crimeSeverityIndex + ", violentCrimeSeverityIndex="
				+ violentCrimeSeverityIndex
				+ ", numberOfMedicalOfficesPerThousant="
				+ numberOfMedicalOfficesPerThousant + ", doctorsPerThousant="
				+ doctorsPerThousant + "]";
	}
	
	
}
