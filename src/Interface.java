import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.image.*;
/**
 * 
 * @author ,MohamedHesham,
 *
 */
public class Interface  extends Application {
	
	private String[] args;
	private static History history;
	private static Equation equationHolder;
	private static StringBuilder equation;
	
	public static void main (String[] args) 
    {
		
		Application.launch(args);
    }
	
String color ="#3399FF";
int styleIndex = 0;
	
    @Override
    public void start(Stage stage) {
    	equation = new StringBuilder();
		history = new History();
        GridPane pane=new GridPane();
        GridPane pane1=new  GridPane();
        BorderPane p=new  BorderPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5,5,5,5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        p.setTop(pane1);
        p.setCenter(pane);
        
        Label screen = new Label();
        screen.setText("hello!!");
        screen.prefWidthProperty().bind(pane1.widthProperty().divide(5));
        screen.prefHeightProperty().bind(pane1.heightProperty().divide(5));
        //screen.setAlignment(Pos.CENTER);
        screen.setMinSize(280,80);
        //screen.setStyle("-fx-background-color:gray");
        pane1.getChildren().add(screen);
        pane1.setAlignment(Pos.CENTER);
        //pane1.setStyle("-fx-background-color:gray");
        
        
        StringBuilder equation = new StringBuilder();
        Button squarX = new Button("^");
        squarX.prefWidthProperty().bind(pane.widthProperty().divide(5));
        squarX.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button setTheme = new Button("Style");
        setTheme.prefWidthProperty().bind(pane.widthProperty().divide(5));
        setTheme.prefHeightProperty().bind(pane.heightProperty().divide(5));
        Button sqrt = new Button("√");
        sqrt.prefWidthProperty().bind(pane.widthProperty().divide(5));
        sqrt.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button log = new Button("log");
        log.prefWidthProperty().bind(pane.widthProperty().divide(5));
        log.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
	    Button sin = new Button("sin");
	    sin.prefWidthProperty().bind(pane.widthProperty().divide(5));
	    sin.prefHeightProperty().bind(pane.heightProperty().divide(5));
	    
	    Button cos = new Button("cos");
	    cos.prefWidthProperty().bind(pane.widthProperty().divide(5));
	    cos.prefHeightProperty().bind(pane.heightProperty().divide(5));
	    
	    Button tan = new Button("tan");
	    tan.prefWidthProperty().bind(pane.widthProperty().divide(5));
	    tan.prefHeightProperty().bind(pane.heightProperty().divide(5));
	    
	    Button pi = new Button("∏");
	    pi.prefWidthProperty().bind(pane.widthProperty().divide(5));
	    pi.prefHeightProperty().bind(pane.heightProperty().divide(5));
	    
		Button lArc = new Button("(");
		lArc.prefWidthProperty().bind(pane.widthProperty().divide(5));
		lArc.prefHeightProperty().bind(pane.heightProperty().divide(5));
		
		Button rArc = new Button(")");
		rArc.prefWidthProperty().bind(pane.widthProperty().divide(5));
		rArc.prefHeightProperty().bind(pane.heightProperty().divide(5));
		
		Button historyBt = new Button("H");
		historyBt.prefWidthProperty().bind(pane.widthProperty().divide(5));
		historyBt.prefHeightProperty().bind(pane.heightProperty().divide(5));
		
		Button div = new Button("/");
		div.prefWidthProperty().bind(pane.widthProperty().divide(5));
		div.prefHeightProperty().bind(pane.heightProperty().divide(5));
		
        Button button_7 = new Button("7"); 
        button_7.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_7.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_8 = new Button("8");
        button_8.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_8.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_9 = new Button("9");
        button_9.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_9.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button muil = new Button("*");   
        muil.prefWidthProperty().bind(pane.widthProperty().divide(5));
        muil.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_4 = new Button("4");
        button_4.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_4.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_5 = new Button("5");
        button_5.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_5.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_6 = new Button("6");
        button_6.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_6.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button sub = new Button("-");
        sub.prefWidthProperty().bind(pane.widthProperty().divide(5));
        sub.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_3= new Button("3");
        button_3.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_3.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_2= new Button("2");
        button_2.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_2.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_1 = new Button("1");
        button_1.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_1.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button sum = new Button("+");  
        sum.prefWidthProperty().bind(pane.widthProperty().divide(5));
        sum.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button dot = new Button(".");
        dot.prefWidthProperty().bind(pane.widthProperty().divide(5));
        dot.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button button_0 = new Button("0");
        button_0.prefWidthProperty().bind(pane.widthProperty().divide(5));
        button_0.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button del = new Button ("Del");
        del.prefWidthProperty().bind(pane.widthProperty().divide(5));
        del.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button X= new Button ("X!");
        X.prefWidthProperty().bind(pane.widthProperty().divide(5));
        X.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button clear = new Button ("Clear");
        clear.prefWidthProperty().bind(pane.widthProperty().divide(5));
        clear.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
        Button equal = new Button("=");
        equal.prefWidthProperty().bind(pane.widthProperty().divide(5));
        equal.prefHeightProperty().bind(pane.heightProperty().divide(5));
        
    
        
        pane.add(sin,0,3);
        pane.add(cos,1,3);
        pane.add(tan,2,3);
        pane.add(lArc,3,3);
        pane.add(rArc,4,3);
        
        pane.add(setTheme,0,4);
        pane.add(squarX,1,4);
        pane.add(historyBt,2,4);
        pane.add(sum,3,4);
        pane.add(pi,4,4);
        
        pane.add(button_7,0,5);
        pane.add(button_8,1,5);
        pane.add(button_9,2,5);
        pane.add(sub,3,5);
        pane.add(log,4,5);
        
        pane.add(button_4,0,6);
        pane.add(button_5,1,6);
        pane.add(button_6,2,6);
        pane.add(muil,3,6);
        pane.add(sqrt,4,6);
        
        pane.add(button_1,0,7);
        pane.add(button_2,1,7);
        pane.add(button_3,2,7);
        pane.add(div,3,7);
        pane.add(X,4,7);
       
        pane.add(dot,0,8);
        pane.add(button_0,1,8);
        pane.add(del,2,8);
        pane.add(clear,3,8);
        pane.add(equal,4,8);
        
        
        //Button style
        sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        setTheme.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        div.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        muil.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        sub.setStyle("-fx-background-radius:30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        sum.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;");
        button_7.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        button_8.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+"; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        button_9.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+"; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        button_6.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+"; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        button_5.setStyle("-fx-background-radius: 30; -fx-background-color:"+color+";-fx-font-weight: bold;  -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,2) , 5, 0.0 , 0 , 2 ); -fx-font-size: 1.1em;");
        button_4.setStyle("-fx-background-radius: 30; -fx-background-color:"+color+"; -fx-font-weight: bold; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,2) , 5, 0.0 , 0 , 2 );  -fx-font-size: 1.1em;");
        button_3.setStyle("-fx-background-radius: 30; -fx-background-color:"+color+";-fx-font-weight: bold; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,2) , 5, 0.0 , 0 , 2 );  -fx-font-size: 1.1em;");
        button_2.setStyle("-fx-background-radius: 30; -fx-background-color:"+color+";-fx-font-weight: bold;  -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,2) , 5, 0.0 , 0 , 2 );  -fx-font-size: 1.1em;");
        button_1.setStyle("-fx-background-radius: 30; -fx-background-color:"+color+";-fx-font-weight: bold;  -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,2) , 5, 0.0 , 0 , 2 ); -fx-font-size: 1.1em;");
        button_0.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.1em;");
        rArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em;");
        lArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.4em;");
        historyBt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em;");
        del.setStyle("-fx-background-radius: 30; -fx-font-size: 1.1em;");
        clear.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        X.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em;");
        del.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em;");
        equal.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold; -fx-font-size:1.4em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        dot.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.4em;");
        
        squarX.setMinSize(30,30);
        setTheme.setMinSize(30,30);
        sqrt .setMinSize(30,30);
        log.setMinSize(30,30);    
        sin.setMinSize(30,30);
        cos.setMinSize(30,30);
        tan.setMinSize(30,30);
        pi.setMinSize(30,30);
        lArc.setMinSize(30,30);
        rArc.setMinSize(30,30);
        historyBt.setMinSize(30,30);
        div.setMinSize(30,30);
        button_7.setMinSize(30,30);
        button_8.setMinSize(30,30);
        button_9.setMinSize(30,30);
        muil.setMinSize(30,30);
        button_4.setMinSize(30,30);
        button_5.setMinSize(30,30);
        button_6.setMinSize(30,30);
        sub.setMinSize(30,30);
        button_3.setMinSize(30,30);
        button_2.setMinSize(30,30);
        button_1.setMinSize(30,30);
        sum.setMinSize(30,30);
        dot.setMinSize(30,30);
        button_0.setMinSize(30,30);
        clear.setMinSize(30,30);
        equal.setMinSize(30,30);
        X.setMinSize(30,30);
        del.setMinSize(30,30);
      
        
        Scene scene = new Scene(p);
        //stage.getIcons().add(new Image(GluonApplication.class.getResourceAsStream("/iconn.png")));
        stage.setScene(scene);
        stage.show();
        //stage.setFullScreen(true);
        stage.setResizable(true);
    
        squarX.setOnAction(e->{
        	equation.append("^");
        	screen.setText(equation.toString());
               // AudioPlayer.ALERT_AUDIOCLIP.play();
            
        });
        
        sqrt.setOnAction(e -> 
        {
        	equation.append("√");
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
        historyBt.setOnAction(e -> 
        {
        	
        	screen.setText(history.getHistory());
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
        X.setOnAction(e -> 
        {
        	equation.append("!");
        	screen.setText(equation.toString());
    	});
        del.setOnAction(e -> 
        {
        	if(equation.length()>0)
        	{
        	equation.delete(equation.length()-1,equation.length());
        	screen.setText(equation.toString());
        	}
    	});

        equal.setOnAction(e -> 
        {
        	if(equation.length()>0)
        	{
        		equationHolder = new Equation(new StringBuilder(equation.substring(0)));
	        	history.addEquation(equationHolder);
	        	double result = equationHolder.getResultDouble();
	        	equation.append(" = " + result);
	        	screen.setText(equation.toString());
	        	equation.delete(0, equation.length());	
        	}

    	});
        

        setTheme.setOnAction(e -> 
        {
        	if (styleIndex >= 5) styleIndex = 0;
        	else styleIndex++;
        	
        	switch(styleIndex)
        	{
        	case 0: 
        		color="#989898";
            	button_7.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_8.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_9.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_4.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_5.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_6.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_3.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_2.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_1.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        	
            	sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:#CCCCFF;");
                squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                setTheme.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                div.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                muil.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                sub.setStyle("-fx-background-radius:30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                sum.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                button_0.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                rArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#CCCCFF;");
                lArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#CCCCFF;");
                historyBt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#CCCCFF;");
                del.setStyle("-fx-background-radius: 30; -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                clear.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                X.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                del.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#CCCCFF;");
                equal.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold; -fx-font-size:1.4em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                dot.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#CCCCFF;");
            
        		break;
        	case 1:
        		color="#FF0033";
            	button_7.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_8.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_9.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_4.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_5.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_6.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_3.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_2.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_1.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        	
            	sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:#FF0099;");
                squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                setTheme.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                div.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                muil.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                sub.setStyle("-fx-background-radius:30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                sum.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                button_0.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                rArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#FF0099;");
                lArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#FF0099;");
                historyBt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#FF0099;");
                del.setStyle("-fx-background-radius: 30; -fx-font-size: 1.1em;");
                clear.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                X.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                del.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#FF0099;");
                equal.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold; -fx-font-size:1.4em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                dot.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#FF0099;");
            
        		break;
        	case 2:
        		color="#00FF33";
            	button_7.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_8.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_9.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_4.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_5.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_6.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_3.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_2.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_1.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        	
            	sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:#00FFCC;");
                squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                setTheme.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                div.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                muil.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                sub.setStyle("-fx-background-radius:30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                sum.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                button_0.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                rArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
                lArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
                historyBt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
                del.setStyle("-fx-background-radius: 30; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                clear.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                X.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                del.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                equal.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold; -fx-font-size:1.4em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                dot.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
            
        		break;
        	case 3:
        		color="#FF00FF";
            	button_7.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_8.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_9.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_4.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_5.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_6.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_3.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_2.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_1.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        	
            	sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:#FF9999;");
                squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                setTheme.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                div.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                muil.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                sub.setStyle("-fx-background-radius:30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                sum.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                button_0.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                rArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#FF9999;");
                lArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#FF9999;");
                historyBt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#FF9999;");
                del.setStyle("-fx-background-radius: 30; -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                clear.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                X.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                del.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#FF9999;");
                equal.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold; -fx-font-size:1.4em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                dot.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#FF9999;");
            
        		break;
        	case 4:
        		color="#9933FF";
            	button_7.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_8.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_9.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_4.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_5.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_6.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_3.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_2.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_1.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        	
            	sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:#00FFCC;");
                squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                setTheme.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                div.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                muil.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                sub.setStyle("-fx-background-radius:30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                sum.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                button_0.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                rArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
                lArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
                historyBt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
                del.setStyle("-fx-background-radius: 30; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                clear.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                X.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                del.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#00FFCC;");
                equal.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold; -fx-font-size:1.4em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                dot.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#00FFCC;");
            
        		break;
        	case 5:
        		color="#CCFF33";
            	button_7.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_8.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_9.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_4.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_5.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_6.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_3.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_2.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
            	button_1.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:"+color+";-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
        	
            	sin.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                cos.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                tan.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                pi.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em;-fx-background-color:#CCFF99;");
                squarX.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                setTheme.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                sqrt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                log.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                div.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                muil.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                sub.setStyle("-fx-background-radius:30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                sum.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                button_0.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                rArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#CCFF99;");
                lArc.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#CCFF99;");
                historyBt.setStyle("-fx-background-radius: 30; -fx-font-weight: bold;  -fx-font-size: 1.4em; -fx-background-color:#CCFF99;");
                del.setStyle("-fx-background-radius: 30; -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                clear.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-background-color:orange;  -fx-font-weight: bold;  -fx-font-size: 1.1em; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                X.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                del.setStyle("-fx-background-radius: 30; -fx-font-weight: bold; -fx-font-size: 1.1em; -fx-background-color:#CCFF99;");
                equal.setStyle("-fx-background-radius: 30;  -fx-font-weight: bold; -fx-font-size:1.4em; -fx-background-color:orange; -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );");
                dot.setStyle("-fx-background-radius: 30;-fx-font-weight: bold; -fx-font-size: 1.4em; -fx-background-color:#CCFF99;");
        		break;
        	}
    	});
    }
}
