package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	private IOperation op;
	private IExpression left;
	private IExpression right;
	private int value;
	
	/**
	 * constructor that sets values for right/left/op/vaSlue
	 * @param left the first value of the expression
	 * @param right the second value of the expression
	 * @param op the operator that is to be used in the expression
	 */
	BinaryExpression(IExpression left, IExpression right, IOperation op) {
		this.op = op;
		this.left = left;
		this.right = right;
		value = op.perform(left, right);
	}

	/**
	 * getter for the value
	 * @return returns the value as an integer
	 */
	public Integer getValue() {
		return value;
	}

}
