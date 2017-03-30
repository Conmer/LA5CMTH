package edu.wmich.cs1120.la5;

public class Literal implements IExpression {

	private int value;
	
	/**
	 * sets the value of the literal as an integer
	 * @param value value of the integer
	 */
	Literal(int value) {
		this.value = value;
	}
	

	/**
	 * gets the value of the literal as an integer
	 * @return the value of the literal as an integer
	 */
	public Integer getValue() {
		return value;
	}

}
