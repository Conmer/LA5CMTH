package edu.wmich.cs1120.la5;

import java.io.*;

public class MapCreatorFromDat implements IMapCreator {

	private TerrainScanner scanner = new TerrainScanner();
	
	/**
	 * reads the binary file into a 10x10 array of type IArea
	 * @param fileName name of the binary file that is being read from
	 * @param threshold threshold of the generated map which changes passable and impassable areas
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		IArea[][] terrain = new IArea[10][10];
		RandomAccessFile input = new RandomAccessFile(fileName, "r");
		double basicEnergyCost;
		double elevation;
		double radiation;
		char operand;
		int val1;
		int val2;
		int result = 0;

		int i = 0;
		int j = 0;

		while (result != -1) {
			input.seek(result*34);
			basicEnergyCost = input.readDouble();
			elevation = input.readDouble();
			radiation = input.readDouble();
			operand = input.readChar();
			val1 = input.readInt();
			val2 = input.readInt();
			if (radiation >= 0.5)
				terrain[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			else if (elevation > (threshold * 0.5))
				terrain[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			else
				terrain[i][j] = new LowArea(basicEnergyCost, elevation, radiation);
			
			result = ExpressionFactory.getExpression(operand, val1, val2).getValue();
			
			j++;
			if (j == 10) {
				j = 0;
				i++;
			}
		}
		input.close();
		getScanner().setTerrain(terrain);
	}

	/**
	 * getter for the TerrainScanner object
	 * @return returns the TerrainScanner object
	 */
	public TerrainScanner getScanner() {
		return scanner;
	}

	/**
	 * setter for the TerrainScanner object
	 * @param scanner an object of TerrainScanner type
	 */
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}

}
