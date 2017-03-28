package edu.wmich.cs1120.la5;

public class HighArea extends Area {

	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * This is the constructor method for the HighArea object 
	 * @param basicEnergyCost The basic energy cost of the area
	 * @param elevation The elevation of the area
	 * @param radiation The radiation of the area.
	 */
	public HighArea(double basicEnergyCost, double elevation, double radiation) {
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}
		
	/**
	 * The getter method for the basic energy cost variable.
	 * @return basicEnergyCost The basic energy cost is returned.
	 */
	public double getBasicEnergyCost() {
		return basicEnergyCost;
	}


	/**
	 * The setter method for the basic energy cost variable.
	 * @param basicEnergyCost The basic energy cost of the area to be set.
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
	}


    /**
     * The getter method for the elevation variable.
     * @return elevation Returns the elevation.
     */
	public double getElevation() {
		return elevation;
	}


	/**
	 * The setter method for the elevation variable.
	 * @param elevation The elevations of the area to be set.
	 */
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}


	/**
	 * The getter method for the radiation variable.
	 * @return radiation The radiation of the area to be returned.
	 */
	public double getRadiation() {
		return radiation;
	}


	/**
	 * The setter method for the radiation variable
	 * @param radiation The radiation of the area to be set.
	 */
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}
	
	/**
	 * This method calculated the amount of energy consumed at the area.
	 * @return Returns the amount of energy consumed.
	 */
	@Override
	public double calcConsumedEnergy() {
		double consumedEnergy = getBasicEnergyCost() * 4;
		return consumedEnergy;
	}
	
}
