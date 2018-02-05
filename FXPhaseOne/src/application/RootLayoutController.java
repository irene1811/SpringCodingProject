package application;
/*
APCS-A FXPhase1
Irene Cho (Haeun)
Johns Creek High School
Period 3
Assignment: FXPhase 1
*/

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
		
	}
	
	//fields for the scene
	@FXML //decorater
	private Button btnFirstButton;
	@FXML
	private Label lblMyLabel;
	
	@FXML
	private Button btnSecondButton;
	private int var = 0;
	@FXML
	private Label lblMySecond;
	
	@FXML
	private void initialize() { //an FXML method
		btnFirstButton.setText("SUB 1");
		btnSecondButton.setText("ADD 1");
		lblMyLabel.setVisible(true);
		lblMySecond.setText("Value");
		var = 7;
		lblMyLabel.setText(Integer.toString(var));
	}
	
	@FXML //Subtract
	public void handleFirstButtonClick() {
		var = var-1;
		lblMyLabel.setText(Integer.toString(var));
	}
	@FXML //Add
	public void handleSecondButtonClick() {
		var = var+1;
		lblMyLabel.setText(Integer.toString(var));
	}
}
