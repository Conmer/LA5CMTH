package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapCreatorFromTxt implements IMapCreator {

	TerrainScanner scanner = new TerrainScanner();
	
	/**
	 * This is the method that scans the input file and fills the IArea[][] terrain with appropriate Area objects.
	 * @param fileName This is the name of the input file
	 * @param threshold This is the threshold given by the user.
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		IArea[][] terrain = new IArea[10][10];
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		String[] data = new String[3];
		
		double basicEnergyCost;
		double elevation;
		double radiation;
		

		
		
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain[0].length; j++) {
			         line = br.readLine();
				     data = line.split(" ");
			         basicEnergyCost = Double.parseDouble(data[0]);
			         elevation = Double.parseDouble(data[1]);
			         radiation = Double.parseDouble(data[2]);
			         if (radiation >= 0.5) 
			        	 terrain[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			         else if (elevation > (threshold * 0.5))
			        	 terrain[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			         else
			        	 terrain[i][j] = new LowArea(basicEnergyCost, elevation, radiation);
		}

		}
		br.close();
		
		getScanner().setTerrain(terrain);
	}
	
	/**
	 * This is the getter method for the Terrain Scanner object scanner.
	 * @return scanner This is the terrain scanner to be returned.
	 */
	@Override
	public TerrainScanner getScanner() {
		return scanner;
	}

	/**
	 * This is the setter method for the TerrainScanner object.
	 * @param scanner This is the scanner to be set.
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
