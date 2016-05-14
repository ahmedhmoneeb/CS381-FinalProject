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

    	//Pane & its properties
    	FlowPane pane = new FlowPane();
    	FlowPane pane1 = new FlowPane();
    	BorderPane p=new BorderPane();
    	pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets ( 5, 5 , 5 , 5));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setStyle("-fx-background-color:gray");
        pane1.setPadding(new Insets ( 5, 5 , 5 , 5));
        pane1.setHgap(5);
        pane1.setVgap(5);
        pane1.setStyle("-fx-background-color:#E0E0E0");
     
        //Stage & Scene 
        Scene scene = new Scene(p,525,355);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("SimCalc");
        primaryStage.show();
        
        //main textField
        Label screen = new Label();
        screen.setAlignment(Pos.CENTER);
        screen.setMinSize(520,80);
        screen.setStyle("-fx-background-color:white");
        pane.getChildren().add(screen);
        p.setTop(pane);
        p.setCenter(pane1);
        
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
		Button div = new Button("/");
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
        Button dot = new Button(".");
        Button button_0 = new Button("0");
        Button del = new Button ("<-");
        Button X= new Button ("X!");
        Button clear = new Button ("Clear");
        Button equal = new Button("=");
        
        //Button style
       sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       invX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.6em;");
       log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       div.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.6em;");
       muil.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.6em;");
       sub.setStyle("-fx-background-radius:20; -fx-font-weight: bold;  -fx-font-size: 1.6em;");
       sum.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.6em;");
       button_7.setStyle("-fx-background-radius: 20;  -fx-font-weight: bold;  -fx-font-size: 1.3em;-fx-background-color:#3399FF;-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
       button_8.setStyle("-fx-background-radius: 20;  -fx-font-weight: bold;  -fx-font-size: 1.3em;-fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
       button_9.setStyle("-fx-background-radius: 20;  -fx-font-weight: bold;  -fx-font-size: 1.3em;-fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       button_6.setStyle("-fx-background-radius: 20;  -fx-font-weight: bold;  -fx-font-size: 1.3em;-fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       button_5.setStyle("-fx-background-radius: 20; -fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-weight: bold;  -fx-font-size: 1.3em;");
       button_4.setStyle("-fx-background-radius: 20; -fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-weight: bold;  -fx-font-size: 1.3em;");
       button_3.setStyle("-fx-background-radius: 20; -fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-weight: bold;  -fx-font-size: 1.3em;");
       button_2.setStyle("-fx-background-radius: 20; -fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-weight: bold;  -fx-font-size: 1.3em;");
       button_1.setStyle("-fx-background-radius: 20; -fx-background-color:#3399FF; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 ); -fx-font-weight: bold;  -fx-font-size: 1.3em;");
       button_0.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.3em;");
       rArc.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.5em;");
       lArc.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.5em;");
       mud.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.5em;");
       del.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       clear.setStyle("-fx-background-radius: 20; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
       X.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       del.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
       equal.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size:2em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
       dot.setStyle("-fx-background-radius: 20; -fx-font-weight: bold;  -fx-font-size: 2em;");
       pane1.getChildren().addAll(sin,cos,tan,pi,squarX,invX,sqrt,log,
    		   button_7,button_8,button_9,lArc,div,muil,sub,sum,button_4,
    		   button_5,button_6,rArc,mud,X,dot,del,button_3,button_2,button_1,button_0,clear,equal
    		   );
    
    	//buttons properties "size"
        squarX.setMinSize(60,60);
        invX.setMinSize(60,60);
        sqrt .setMinSize(60,60);
        log.setMinSize(60,60);    
        sin.setMinSize(60,60);
        cos.setMinSize(60,60);
        tan.setMinSize(60,60);
        pi.setMinSize(60,60);
        lArc.setMinSize(60,60);
        rArc.setMinSize(60,60);
        mud.setMinSize(60,60);
        div.setMinSize(60,60);
        button_7.setMinSize(60,60);
        button_8.setMinSize(60,60);
        button_9.setMinSize(60,60);
        muil.setMinSize(60,60);
        button_4.setMinSize(60,60);
        button_5.setMinSize(60,60);
        button_6.setMinSize(60,60);
        sub.setMinSize(60,60);
        button_3.setMinSize(60,60);
        button_2.setMinSize(60,60);
        button_1.setMinSize(60,60);
        sum.setMinSize(60,60);
        dot.setMinSize(60,60);
        button_0.setMinSize(60,60);
        clear.setMinSize(125,60);
        equal.setMinSize(125,60);
        X.setMinSize(60,60);
        del.setMinSize(60,60);

        //Buttons events and actions
        squarX.setOnAction(e -> 
        {
        	equation.append("^");
        	screen.setText(equation.toString());
    	});
        invX.setOnAction(e -> 
        {
        	equation.append("inv(");
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
        	equation.append("tan(");
        	screen.setText(equation.toString());
    	});
        pi.setOnAction(e -> 
        {
        	equation.append(Math.PI);
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
        del.setOnAction(e -> 
        {
        	equation.delete(equation.length()-1,equation.length());
        	screen.setText(equation.toString());
    	});
        X.setOnAction(e -> 
        {
        	equation.append("!");
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
    	case '%':finalResult = Double.parseDouble(rhs.toString()) % Double.parseDouble(lhs.toString());break;
    	case '^':finalResult = Math.pow(Double.parseDouble(rhs.toString()),Double.parseDouble(lhs.toString()));break;
    	
    	}
    	return finalResult;
    }
    
  
    public static double solveEquation2(StringBuilder tempEquation)
    {
    	double finalResult = 0;
    	String rhs = new String();
    	String str=tempEquation.substring(0,4);
    	rhs=tempEquation.substring(4,tempEquation.length()-1);
            if (str.compareToIgnoreCase("sin(")==0 || str.compareToIgnoreCase("cos(")==0 || str.compareToIgnoreCase("tan(")==0 || str.compareToIgnoreCase("log(")==0
            		|| str.compareToIgnoreCase("inv(")==0 || str.compareToIgnoreCase("sqrt(")==0)
            {
            switch(str){
        case "sin(":
        	finalResult = Math.sin(Double.parseDouble(rhs));
            break;
        case "cos(":
        	finalResult = Math.cos(Double.parseDouble(rhs));
            break;
        case "tan(":
        	finalResult = Math.tan(Double.parseDouble(rhs));
            break;
        case "log(":
            finalResult = Math.log(Double.parseDouble(rhs));
            break;
        case "sqrt(":
            finalResult = Math.sqrt(Double.parseDouble(rhs));
            break;    
        case "inv(":
            finalResult = 1/(Double.parseDouble(rhs));
            break;    
        default : 
            break;
            }}
		return finalResult;
    }
    public static void main (String[] args) {
    Application.launch(args);  
    }
}