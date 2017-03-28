package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	@Override
	public Integer perform(IExpression left, IExpression right) {
		int result = (left.getValue() - right.getValue());
		return result;
	}

}
