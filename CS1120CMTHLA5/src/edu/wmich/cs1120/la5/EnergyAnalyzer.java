package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	private String analysis;
	private ArrayList<IArea> path = new ArrayList<>();

	/**
	 * gets the path object
	 * 
	 * @return returns the the path object of type IArea
	 */
	public ArrayList<IArea> getPath() {
		return path;
	}

	/**
	 * sets the path object
	 * 
	 * @param path
	 *            the ArrayList filled with objects of type IArea
	 */
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}
	
	/**
	 * calculates the total energy consumed on the path
	 */
	public void analyzePath() {

		analysis = "0";
		double total = 0;

		for (int i = 0; i < path.size(); i++) {

			total = total + path.get(i).calcConsumedEnergy();

		}

		analysis = "Total Energy: " + Double.toString(total);

	}

	/**
	 * gets the value of analysis
	 * 
	 * @return returns the analysis String
	 */
	public String getAnalysis() {
		return analysis;
	}

	/**
	 * sets the value for analysis
	 * 
	 * @param analysis
	 *            analysis string
	 */
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

}