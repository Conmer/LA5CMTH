package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	private IOperation op;
	private IExpression left;
	private IExpression right;
	private int value;

	BinaryExpression(IExpression left, IExpression right, IOperation op) {
		this.op = op;
		this.left = left;
		this.right = right;
		value = op.perform(left, right);
	}

	@Override
	public Integer getValue() {
		return value;
	}

}
