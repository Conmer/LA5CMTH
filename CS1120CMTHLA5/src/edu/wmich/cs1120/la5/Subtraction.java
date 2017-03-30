package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	/**
	 * subtracts the right value from the left value
	 * @param left the first object that contains a number from the binary file
	 * @param right the second object that contains a number from the binary file
	 * @return the result of the two values as an integer after subtraction
	 */
	public Integer perform(IExpression left, IExpression right) {
		int result = (left.getValue() - right.getValue());
		return result;
	}

}
