package edu.wmich.cs1120.la5;

import java.io.*;

public class MapCreatorFromDat implements IMapCreator {

	TerrainScanner scanner = new TerrainScanner();
	
	@Override
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

			if (operand == '+')
				result = (val1 + val2);
			else
				result = (val1 - val2);
			
			j++;
			if (j == 10) {
				j = 0;
				i++;
			}
		}
		input.close();
		getScanner().setTerrain(terrain);
	}

	@Override
	public TerrainScanner getScanner() {
		return scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
