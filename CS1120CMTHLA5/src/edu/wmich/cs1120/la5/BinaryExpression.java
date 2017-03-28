package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	IOperation op;
	IExpression left;
	IExpression right;
	
	BinaryExpression(IExpression left, IExpression right, IOperation op) {
		this.op = op;
		this.left = left;
		this.right = right;
	}
	
	@Override
	public Integer getValue() {
		return null;
	}

}
