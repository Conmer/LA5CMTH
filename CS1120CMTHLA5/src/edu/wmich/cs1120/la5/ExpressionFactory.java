package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	public static IExpression getExpression(char operator, int val1, int val2) {
		
		IExpression left = new Literal(val1);
		IExpression right = new Literal(val2);
		IOperation op;
		if (operator == '+')
			op = new Addition();
		else
			op = new Subtraction();
		
		IExpression exp = new BinaryExpression(left, right, op);
		
		IExpression result = new Literal(exp.getValue());
		
		return result;
		
		
	
	}
}
