package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	
	
	/**
	 * checks what the operator of the expression is and creates a new expression object based on it
	 * @param operator either a +/- and decides what expression will be carried out
	 * @param val1 the first value of the expression
	 * @param val2 the second value of the expression
	 * @return returns the value of the expression after it is carried out appropriately
	 */
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
