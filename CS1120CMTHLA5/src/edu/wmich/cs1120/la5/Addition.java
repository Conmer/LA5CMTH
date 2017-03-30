package edu.wmich.cs1120.la5;

public class Addition implements IOperation {

	/**
	 * Adds the two values
	 * @param left the first value being added
	 * @param right the second value being added
	 * @return the result of the addition
	 */
	public Integer perform(IExpression left, IExpression right) {
		int result = (left.getValue() + right.getValue());
		return result;
	}

}
