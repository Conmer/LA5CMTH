package edu.wmich.cs1120.la5;

import java.util.*;

public interface IRover {
	
	ArrayList<IArea> getPath();
	void setPath(ArrayList<IArea> path);
	void analyzePath();
	String getAnalysis();
	void setAnalysis(String analysis);
	String toString();
	
	
}
