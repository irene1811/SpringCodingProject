package application;
/*
APCS-A FXPhase1
Irene Cho (Haeun)
Johns Creek High School
Period 3
Assignment: FXPhase 1
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	//Private fields to hold one stage and root layout of our main window
	private Stage primaryStage; //where it is "handle"
	private BorderPane rootLayout; //baseline layout
	
	@Override
	public void start(Stage primaryStage) {
		try {
			//set main application and provide title and Icon
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Hello World for Privates");
			//set the Application Icon
			this.primaryStage.getIcons().add(new Image("file:resource/AppIcon.png"));
			
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		RootLayoutController.dataCollected();
		launch(args);
	}

	public void initRootLayout() {
		try {
			//Main initialization for layout and app commencement
			
			//Create an FXML Loader
			FXMLLoader loader = new FXMLLoader();
			
			//point loader to FXML file
			loader.setLocation(Main.class.getResource("/application/RootLayout.FXML"));
			
			//Sets root layout field, casting as BoarderPane, injected via FXML
			rootLayout = (BorderPane) loader.load();
			
			//Sets scene object to rootLayout
			Scene scene = new Scene(rootLayout);
			
			//Giving Controller access to the Main Program
			RootLayoutController controller = loader.getController();
			
			controller.setMainApp(this);
			
			
			//Set the primary scene to our scene object
			primaryStage.setScene(scene);
			
			//Show the primary stage object
			primaryStage.show();
			
		} catch(IOException e) { //e convention for errors
			e.printStackTrace();
		}
	}

}
