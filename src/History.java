import java.util.*;

public class History {

	private ArrayList<Equation> equations;
	
	public History()
	{
		equations = new ArrayList<Equation>();
	}
	
	public void addEquation(Equation equation)
	{
		equations.add(equation);
	}
	
	public String getHistory()
	{
		StringBuilder tempHistory = new StringBuilder();
		for (int i=0;i<equations.size();i++)
		{
			tempHistory.append(equations.get(i).getEquation() + " = " + equations.get(i).getResult() + "\n");
		}
		return tempHistory.toString();
	}
	
}
