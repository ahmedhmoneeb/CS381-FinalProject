import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
//hasan
    	//Pane & its properties
    	FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets ( 5, 5 , 5 , 5));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setStyle("-fx-background-color:gray");

        //Stage & Scene 
        Scene scene = new Scene(pane,200,380);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("SimCalc");
        primaryStage.show();
        
        //main textField
        TextField screen = new TextField();
        screen.setEditable(false);
        screen.setAlignment(Pos.CENTER);
        screen.setMinSize(180, 50);
        screen.setStyle("-fx-background-color:white");
        pane.getChildren().add(screen);
        
        //main statement entered by the user before pressing =
        StringBuilder equation = new StringBuilder();
        
        //Buttons objects and their names
        Button squarX = new Button("x^2");
        Button invX = new Button("1/x");
        Button sqrt = new Button("√");
        Button log = new Button("log");
	    Button sin = new Button("sin");
	    Button cos = new Button("cos");
	    Button tan = new Button("tan");
	    Button pi = new Button("∏");
		Button lArc = new Button("(");
		Button rArc = new Button(")");
		Button mud = new Button("%");
		Button div = new Button("÷");
        Button button_7 = new Button("7"); 
        Button button_8 = new Button("8");
        Button button_9 = new Button("9");
        Button muil = new Button("*");        
        Button button_4 = new Button("4");
        Button button_5 = new Button("5");
        Button button_6 = new Button("6");
        Button sub = new Button("-");
        Button button_3= new Button("3");
        Button button_2= new Button("2");
        Button button_1 = new Button("1");
        Button sum = new Button("+");        
        Button dot = new Button("•");
        Button button_0 = new Button("0");
        Button clear = new Button ("←");
        Button equal = new Button("=");
    
       //adding the buttons to the pane	
        pane.getChildren().addAll(squarX,invX,sqrt,log,
        							sin,cos,tan,pi,
        							lArc,rArc,mud,div,
        							button_7,button_8,button_9,muil,
        							button_4,button_5,button_6,sub,
        							button_3,button_2,button_1,sum,
        							dot,button_0,clear,equal);

    	//buttons properties "size"
        squarX.setMinSize(40, 40);
        invX.setMinSize(40, 40);
        sqrt .setMinSize(40, 40);
        log.setMinSize(40, 40);    
        sin.setMinSize(40, 40);
        cos.setMinSize(40, 40);
        tan.setMinSize(40, 40);
        pi.setMinSize(40, 40);
        lArc.setMinSize(40, 40);
        rArc.setMinSize(40, 40);
        mud.setMinSize(40, 40);
        div.setMinSize(40, 40);
        button_7.setMinSize(40, 40);
        button_8.setMinSize(40, 40);
        button_9.setMinSize(40, 40);
        muil.setMinSize(40, 40);
        button_4.setMinSize(40, 40);
        button_5.setMinSize(40, 40);
        button_6.setMinSize(40, 40);
        sub.setMinSize(40, 40);
        button_3.setMinSize(40, 40);
        button_2.setMinSize(40, 40);
        button_1.setMinSize(40, 40);
        sum.setMinSize(40, 40);
        dot.setMinSize(40, 40);
        button_0.setMinSize(40, 40);
        clear.setMinSize(40, 40);
        equal.setMinSize(40, 40);

        //Buttons events and actions
        squarX.setOnAction(e -> 
        {
        	equation.append("^");
        	screen.setText(equation.toString());
    	});
        invX.setOnAction(e -> 
        {
        	equation.append("inv");
        	screen.setText(equation.toString());
    	});
        sqrt.setOnAction(e -> 
        {
        	equation.append("sqrt(");
        	screen.setText(equation.toString());
    	});
        log.setOnAction(e -> 
        {
        	equation.append("log(");
        	screen.setText(equation.toString());
    	});    
        sin.setOnAction(e -> 
        {
        	equation.append("sin(");
        	screen.setText(equation.toString());
    	});
        cos.setOnAction(e -> 
        {
        	equation.append("cos(");
        	screen.setText(equation.toString());
    	});
        tan.setOnAction(e -> 
        {
        	equation.append("tan");
        	screen.setText(equation.toString());
    	});
        pi.setOnAction(e -> 
        {
        	equation.append("Pi");
        	screen.setText(equation.toString());
    	});
        lArc.setOnAction(e -> 
        {
        	equation.append("(");
        	screen.setText(equation.toString());
    	});
        rArc.setOnAction(e -> 
        {
        	equation.append(")");
        	screen.setText(equation.toString());
    	});
        mud.setOnAction(e -> 
        {
        	equation.append("%");
        	screen.setText(equation.toString());
    	});
        div.setOnAction(e -> 
        {
        	equation.append("/");
        	screen.setText(equation.toString());
    	});
        button_7.setOnAction(e -> 
        {
        	equation.append("7");
        	screen.setText(equation.toString());
    	});
        button_8.setOnAction(e -> 
        {
        	equation.append("8");
        	screen.setText(equation.toString());
    	});
        button_9.setOnAction(e -> 
        {
        	equation.append("9");
        	screen.setText(equation.toString());
    	});
        muil.setOnAction(e -> 
        {
        	equation.append("*");
        	screen.setText(equation.toString());
    	});
        button_4.setOnAction(e -> 
        {
        	equation.append("4");
        	screen.setText(equation.toString());
    	});
        button_5.setOnAction(e -> 
        {
        	equation.append("5");
        	screen.setText(equation.toString());
    	});
        button_6.setOnAction(e -> 
        {
        	equation.append("6");
        	screen.setText(equation.toString());
    	});
        sub.setOnAction(e -> 
        {
        	equation.append("-");
        	screen.setText(equation.toString());
    	});
        button_3.setOnAction(e -> 
        {
        	equation.append("3");
        	screen.setText(equation.toString());
    	});
        button_2.setOnAction(e -> 
        {
        	equation.append("2");
        	screen.setText(equation.toString());
    	});
        button_1.setOnAction(e -> 
        {
        	equation.append("1");
        	screen.setText(equation.toString());
    	});
        sum.setOnAction(e -> 
        {
        	equation.append("+");
        	screen.setText(equation.toString());
    	});
        dot.setOnAction(e -> 
        {
        	equation.append(".");
        	screen.setText(equation.toString());
    	});
        button_0.setOnAction(e -> 
        {
        	equation.append("0");
        	screen.setText(equation.toString());
    	});
        clear.setOnAction(e -> 
        {
        	equation.delete(0, equation.length());
        	screen.setText(equation.toString());
    	});
        equal.setOnAction(e -> 
        {
        	double result = solveEquation(equation);
        	equation.append(" = " + result);
        	screen.setText(equation.toString());
        	equation.delete(0, equation.length());
    	});
    }

    public static double solveEquation(StringBuilder tempEquation)
    {
    	double finalResult = 0;
    	StringBuilder rhs = new StringBuilder();
    	StringBuilder lhs = new StringBuilder();
    	char operation = ' ';
    	
    	for (int i=0;i<tempEquation.length();i++)
    	{
    		if( operation == ' ' && Character.isDigit( tempEquation.charAt(i) ) )
    		{
    			rhs.append(tempEquation.charAt(0));
    		}
    		else
    		{
    			if( ! Character.isDigit( tempEquation.charAt(i) ))
    			{
    				operation = tempEquation.charAt(i);
    			}
    			if (operation != ' ' && Character.isDigit( tempEquation.charAt(i) ) )
    			{
    				lhs.append(tempEquation.charAt(i));
    			}
    		}    		
    	}
    	switch(operation)
    	{
    	case '+':finalResult = Double.parseDouble(rhs.toString()) + Double.parseDouble(lhs.toString());break;
    	case '-':finalResult = Double.parseDouble(rhs.toString()) - Double.parseDouble(lhs.toString());break;
    	case '*':finalResult = Double.parseDouble(rhs.toString()) * Double.parseDouble(lhs.toString());break;
    	case '/':finalResult = Double.parseDouble(rhs.toString()) / Double.parseDouble(lhs.toString());break;
    	}
    	return finalResult;
    }
    
    public static void main (String[] args) {
    Application.launch(args);  
    }
}