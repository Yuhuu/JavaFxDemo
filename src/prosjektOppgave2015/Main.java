package prosjektOppgave2015;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	Button button1,button2,button3,button4,button5,button6;
	RadioButton rb1,rb2, rb3;
	Image image1,image2,image3;

	public static void main(String[] args) {
		launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		BorderPane root = new BorderPane();
		Scene scence = new Scene(root,300,200);
		 GridPane gridpane = new GridPane();
	     ColumnConstraints col1 = new ColumnConstraints(200);
	 
	     ColumnConstraints col2 = new ColumnConstraints(100);
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
		
		
		Image image1 = new Image(getClass().getResourceAsStream("ok.jpg"));
		Image image2 = new Image(getClass().getResourceAsStream("ok.jpg"));
		Image image3 = new Image(getClass().getResourceAsStream("ok.jpg"));
		
		final ToggleGroup group = new ToggleGroup();
		RadioButton rb1 = new RadioButton("Home");
		rb1.setToggleGroup(group);
		RadioButton rb2 = new RadioButton("Calendar");
		rb2.setToggleGroup(group);
		RadioButton rb3 = new RadioButton("Contact");
		rb3.setToggleGroup(group);
		
		group.selectedToggleProperty().addListener(
			    (ObservableValue<? extends Toggle> ov, Toggle old_toggle, 
			    Toggle new_toggle) -> {
			        if (group.getSelectedToggle() != null) {
			            final Image image = new Image(
			                getClass().getResourceAsStream(
			                group.getSelectedToggle().getUserData().toString() +
			                ".jpg"));
			        icon.setImage(image);
			    }
			});
	
		gridpane.add(button1,0,0);
		gridpane.add(gridpane2,1,0);
		gridpane.add(gridpane3,0,1);
		
		gridpane.add(rb1,1,1);
		gridpane.add(rb2,1,2);
		gridpane.add(rb3,1,3);
		root.getChildren().add(gridpane);

		
		window.setScene(scence);
		window.show();
		
	}
}

