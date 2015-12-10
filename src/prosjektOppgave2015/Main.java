package prosjektOppgave2015;

import javafx.stage.*;
import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {
	Stage window;
	Button button1,button2,button3,button4,button5,button6;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*The javafx.application.Application class is abstract as it contains many application life 
	 * cycle functions such as initializing, launching, starting and stopping. The main() method 
	 * launches the javafx application by passing in the command-line arguments to the launch() method.
	 * After executing the launch() method. the javafx application will enter a ready state, 
	 * then the start() method is the main entry point for all javafx applications. After invoking the
	 *  start() method, the program runs in the JavaFX thread instead of main
	 * 
	*/
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		BorderPane root = new BorderPane();
		Scene scence = new Scene(root,200,200);
		 GridPane gridpane = new GridPane();
	     ColumnConstraints col1 = new ColumnConstraints(133);
	 
	     ColumnConstraints col2 = new ColumnConstraints(67);
	     col2.setHgrow(Priority.ALWAYS);
	     gridpane.getColumnConstraints().addAll(col1,col2);
	     
		button1 = new Button("     STOR KNAPP！        ");
		button1.setOnAction(e->window.close());
		button2 = new Button("ddddddddddd knapp");
		
		GridPane gridpane2 = new GridPane();
		GridPane gridpane3 = new GridPane();
		button3 = new Button("Stor knapp");
		button3.setOnAction(e->window.close());
		button4 = new Button("ddddddddddd knapp");
		gridpane2.add(button2,0,0);
		gridpane2.add(button3,0,1);
		
		
		button5 = new Button("button5 knapp");
		button5.setOnAction(e->window.close());
		button6 = new Button("button6 knapp");
		gridpane3.add(button5,0,0);
		gridpane3.add(button6,1,0);
//		GridPane.setHalignment(button1, HPos.RIGHT);
		gridpane.add(button1,0,0);
		gridpane.add(gridpane2,1,0);
	
		gridpane.add(gridpane3,0,1);
		
		root.getChildren().add(gridpane);

		
		window.setScene(scence);
		window.show();
		
	}
}

