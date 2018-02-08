package application;
/*
APCS-A FXPhase1
Irene Cho (Haeun)
Johns Creek High School
Period 3
Assignment: FXPhase 1
*/

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootLayoutController {

	private Main mainApp;
	
	public void setMainApp(Main mainApp) { //setter
		this.mainApp = mainApp;
	}

	//must have a constructor even if it is blank because JavaFX will not properly initialize
	
	public RootLayoutController() {
		ArrayList<Integer> studentID = new ArrayList<Integer>();
		ArrayList<Integer> grade = new ArrayList<Integer>();
		ArrayList<Integer> password = new ArrayList<Integer>();
	}
	
	//fields for the scene

	
	@FXML
	private void initialize() { //an FXML method
	
	}
	
	@FXML //Subtract
	public void handleFirstButtonClick() {

	}
	@FXML //Add
	public void handleSecondButtonClick() {
		
	}
}
