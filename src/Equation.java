/**
 * 
 * @author ahmedmoneeb
 *
 */
public class Equation {
	
	private StringBuilder equation;
	private StringBuilder result;

	public Equation(StringBuilder equation)
	{
		this.equation = equation;
		result = new StringBuilder(equation);
		result = parseEquation(result);
	}
	/**
	 * 
	 * @return String
	 */
	public String getEquation()
	{
		
		return equation.toString();
	}
	/**
	 * 
	 * @return String
	 */
	public String getResult()
	{
		
		return result.toString();
	}
	/**
	 * 
	 * @return double
	 */
	public double getResultDouble()
	{
		double resultDouble = Double.parseDouble(getResult());
		return resultDouble;
	}
	/**
	 * 
	 * @param equation
	 * @return  StringBuilder
	 */
	public static StringBuilder parseEquation(StringBuilder equation)
	{	
		while (!isFinished(equation))
		{
			
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == 's' || equation.charAt(i) == 'c' || equation.charAt(i) == 't')
				{
					equation = executeTrigonometric(equation,i);break;
				}
			}
			
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == 'l' )
				{
					equation = executeLog(equation,i);break;
				}
			}
			
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '(' )
				{
					equation = executeBrackets(equation,i);break;
				}
			}

			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '/' )
				{
					equation = executeDivision(equation,i);break;
				}
			}
			
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '*' )
				{
					equation = executeMultiplication(equation,i);break;
				}
			}
			
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '-' )
				{
					equation = executeSubtraction(equation,i);break;
				}
			}
			
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '+' )
				{
					equation = executeAddition(equation,i);break;
				}
			}
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '^' )
				{
					equation = executePower(equation,i);break;
				}
			}
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '!' )
				{
					equation = executeFactorial(equation,i);break;
				}
			}
			for (int i=0; i<equation.length(); i++)
			{
				if(equation.charAt(i) == '√' )
				{
					equation = executeSquareRoot(equation,i);break;
				}
			}
		}
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @return boolean
	 */
	public static boolean isFinished(StringBuilder equation)
	{
		boolean finished = true;
		
		for (int i=0; i<equation.length(); i++)
		{
			if( !Character.isDigit(equation.charAt(i)) && equation.charAt(i) != '.')
			{
				finished = false;
			}
		}
		
		return finished;
	}
	/**
	 * 
	 * @param equation
	 * @param leftBracketPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeBrackets(StringBuilder equation, int leftBracketPos)
	{
		int rightBracketPos = 0;
		StringBuilder innerEquation = new StringBuilder();
		for (int i=leftBracketPos; i<equation.length(); i++)
		{
			if(equation.charAt(i) == ')' )
			{
				rightBracketPos = i;
				break;
			}
		}
		innerEquation = new StringBuilder(equation.substring(leftBracketPos+1,rightBracketPos));
		innerEquation = new StringBuilder(parseEquation(innerEquation));
		equation.replace(leftBracketPos, rightBracketPos+1, innerEquation.toString());
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	
	public static StringBuilder executeTrigonometric(StringBuilder equation, int operatorPos)
	{
		StringBuilder value = new StringBuilder();
		String temp = "";
		double result = 0.0;
		int start = operatorPos;
		int end = 0;
		for(int i=start+4; i<equation.length() & equation.charAt(i) != ')' ; i++)
		{
			value.append(equation.charAt(i));
			end = i;
		}
		switch(equation.charAt(operatorPos))
		{
		case 's':
			result = Math.sin(Double.parseDouble(value.toString()));
			break;
		case 'c':
			result = Math.cos(Double.parseDouble(value.toString()));
			break;
		case 't':
			result = Math.tan(Double.parseDouble(value.toString()));
			break;
		} 
		if (result < 0.0) result *= -1;
		temp = Double.toString(result);
		equation.replace(start, end+2, temp);
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeDivision(StringBuilder equation, int operatorPos)
	{
		StringBuilder leftHandSide = new StringBuilder();
		StringBuilder rightHandSide = new StringBuilder();
		String temp;
		int start = 0;
		int end = 0;
		for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
		{
			leftHandSide.append(equation.charAt(i));
			start = i;
		}
		leftHandSide = leftHandSide.reverse();
		for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
		{
			rightHandSide.append(equation.charAt(i));
			end = i;
		}
		temp = Double.toString(Double.parseDouble(leftHandSide.toString()) / Double.parseDouble(rightHandSide.toString()));
		equation.replace(start, end+1, temp);
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeMultiplication(StringBuilder equation, int operatorPos)
	{
		StringBuilder leftHandSide = new StringBuilder();
		StringBuilder rightHandSide = new StringBuilder();
		String temp;
		int start = 0;
		int end = 0;
		for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
		{
			leftHandSide.append(equation.charAt(i));
			start = i;
		}
		leftHandSide = leftHandSide.reverse();
		for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
		{
			rightHandSide.append(equation.charAt(i));
			end = i;
		}
		temp = Double.toString(Double.parseDouble(leftHandSide.toString()) * Double.parseDouble(rightHandSide.toString()));
		equation.replace(start, end+1, temp);
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeSubtraction(StringBuilder equation, int operatorPos)
	{
		StringBuilder leftHandSide = new StringBuilder();
		StringBuilder rightHandSide = new StringBuilder();
		String temp;
		int start = 0;
		int end = 0;
		for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
		{
			leftHandSide.append(equation.charAt(i));
			start = i;
		}
		leftHandSide = leftHandSide.reverse();
		for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
		{
			rightHandSide.append(equation.charAt(i));
			end = i;
		}
		temp = Double.toString(Double.parseDouble(leftHandSide.toString()) - Double.parseDouble(rightHandSide.toString()));
		equation.replace(start, end+1, temp);
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeAddition(StringBuilder equation, int operatorPos)
	{
		StringBuilder leftHandSide = new StringBuilder();
		StringBuilder rightHandSide = new StringBuilder();
		String temp;
		int start = 0;
		int end = 0;
		for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
		{
			leftHandSide.append(equation.charAt(i));
			start = i;
		}
		leftHandSide = leftHandSide.reverse();
		for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
		{
			rightHandSide.append(equation.charAt(i));
			end = i;
		}
		temp = Double.toString(Double.parseDouble(leftHandSide.toString()) + Double.parseDouble(rightHandSide.toString()));
		equation.replace(start, end+1, temp);
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executePower(StringBuilder equation, int operatorPos)
	{
		StringBuilder leftHandSide = new StringBuilder();
		StringBuilder rightHandSide = new StringBuilder();
		String temp;
		int start = 0;
		int end = 0;
		for(int i=operatorPos-1; i>=0 && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i--)
		{
			leftHandSide.append(equation.charAt(i));
			start = i;
		}
		leftHandSide = leftHandSide.reverse();
		for(int i=operatorPos+1; i<equation.length() && ( Character.isDigit(equation.charAt(i)) || equation.charAt(i) == '.') ; i++)
		{
			rightHandSide.append(equation.charAt(i));
			end = i;
		}
		temp = Double.toString(Math.pow(Double.parseDouble(leftHandSide.toString()), Double.parseDouble(rightHandSide.toString())));
		equation.replace(start, end+1, temp);
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeFactorial(StringBuilder equation, int operatorPos)
	{
		StringBuilder value = new StringBuilder();
		String temp = "";
		int start = 0;
		int end = operatorPos;
		for(int i=end-1; i>=0 && Character.isDigit(equation.charAt(i)) ; i--)
		{
			value.append(equation.charAt(i));
			start = i;
		}
		value = value.reverse();
		temp = Integer.toString(factorial(Integer.parseInt(value.toString())));
		equation.replace(start, end+2, temp);
		return equation;
	}
	/**
	 * 
	 * @param n
	 * @return int
	 */
	public static int factorial(int n) 
	{
	    int factorial=1;
	    for (int i=1; i<=n; i++) {
	        factorial=factorial * i;
	    }
	    return factorial;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeSquareRoot(StringBuilder equation, int operatorPos)
	{
		StringBuilder value = new StringBuilder();
		String temp = "";
		int start = operatorPos;
		int end = 0;
		for(int i=start+1; i<equation.length() && Character.isDigit(equation.charAt(i)) ; i++)
		{
			value.append(equation.charAt(i));
			end = i;
		}
		temp = Double.toString(Math.sqrt(( Double.parseDouble(value.toString() ) )));
		equation.replace(start, end+1, temp);
		return equation;
	}
	/**
	 * 
	 * @param equation
	 * @param operatorPos
	 * @return  StringBuilder
	 */
	public static StringBuilder executeLog(StringBuilder equation, int operatorPos)
	{
		StringBuilder value = new StringBuilder();
		String temp = "";
		int start = operatorPos;
		int end = 0;
		for(int i=start+4; i<equation.length() && equation.charAt(i) != ')' ; i++)
		{
			value.append(equation.charAt(i));
			end = i;
		}
		System.out.println("value: " + value.toString());
		temp = Double.toString(Math.log(Double.parseDouble(value.toString())));
		equation.replace(start, end+2, temp);
		return equation;
	}

	
	
}
