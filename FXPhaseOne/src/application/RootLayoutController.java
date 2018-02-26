package application;
/*
AP-CSA Smart Voting
Irene Cho, Ria Gonsalves, Saachi Wadhwani
Johns Creek High School
Period 3
Assignment: Spring Project
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class RootLayoutController {

	private Main mainApp;
	private static List<Student> studentList = new ArrayList<Student>();

	
	public void setMainApp(Main mainApp) { //setter
		this.mainApp = mainApp;
	}
	
	//must have a constructor even if it is blank because JavaFX will not properly initialize
	
	public RootLayoutController() { }

	public static void dataCollected() {
		String filename = "samples.csv";
		File file = new File(filename);
			// you can read input stream, delete etc.
		try {
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()) {	
				String data = inputStream.next(); //gets the whole line
				String[] values = data.split(",");
				//get data from the excel file and put it in the student class
				Student temp = new Student(values[0], values[1], values[2], values[3], values[4].replace("/", ""));
				//put the new object into the arraylist of students
				studentList.add(temp);	
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//delete later
		System.out.println(studentList.get(0).getStudentID());
		System.out.println(studentList.get(0).getFirstName());
		System.out.println(studentList.get(0).getLastName());
		System.out.println(studentList.get(0).getGrade());
		System.out.println(studentList.get(0).getPassword());
	}
	
	@FXML
	private Label pollListLbl;
	@FXML 
	private Label pollNameLbl;
	@FXML 
	private Label poll1Lbl;
	@FXML 
	private Label poll2Lbl;
	@FXML 
	private Label poll3Lbl;
	@FXML 
	private Label poll4Lbl;
	@FXML 
	private Label poll5Lbl;
	@FXML 
	private Label poll6Lbl;
	@FXML 
	private Label questionLbl;
	@FXML 
	private Label option1Lbl;
	@FXML 
	private Label option2Lbl;
	@FXML 
	private Label option3Lbl;
	@FXML 
	private Label option4Lbl;
	@FXML 
	private Label option5Lbl;
	@FXML 
	private Label option6Lbl;
	@FXML 
	private Label option7Lbl;
	@FXML 
	private Label option8Lbl;
	@FXML 
	private Label option9Lbl;
	@FXML 
	private Label option10Lbl;
	@FXML 
	private Label questionLbl1;
	@FXML 
	private Label option1Lbl1;
	@FXML 
	private Label option2Lbl1;
	@FXML 
	private Label option3Lbl1;
	@FXML 
	private Label option4Lbl1;
	@FXML 
	private Label option5Lbl1;
	@FXML 
	private Label option6Lbl1;
	@FXML 
	private Label option7Lbl1;
	@FXML 
	private Label option8Lbl1;
	@FXML 
	private Label option9Lbl1;
	@FXML 
	private Label option10Lbl1;
	@FXML 
	private Button preview1But;
	@FXML 
	private Button preview2But;
	@FXML 
	private Button preview3But;
	@FXML 
	private Button preview4But;
	@FXML 
	private Button preview5But;
	@FXML 
	private Button preview6But;
	@FXML 
	private Button result1But;
	@FXML 
	private Button result2But;
	@FXML 
	private Button result3But;
	@FXML 
	private Button result4But;
	@FXML 
	private Button result5But;
	@FXML 
	private Button result6But;
	@FXML 
	private Button newOp;
	@FXML 
	private Button inc;
	@FXML 
	private Button dec;
	@FXML 
	private Button inc1;
	@FXML 
	private Button dec1;
	@FXML 
	private Button save;
	@FXML 
	private Button closeOpenBut;
	@FXML 
	private TextField op1;
	@FXML 
	private TextField op2;
	@FXML 
	private TextField op3;
	@FXML 
	private TextField op4;
	@FXML 
	private TextField op5;
	@FXML 
	private TextField op6;
	@FXML 
	private TextField op7;
	@FXML 
	private TextField op8;
	@FXML 
	private TextField op9;
	@FXML 
	private TextField op10;
	@FXML 
	private TextField questiontxtfld;
	@FXML 
	private Tab edit;
	@FXML 
	private Tab view; 
	@FXML 
	private CheckBox ninth;
	@FXML 
	private CheckBox tenth;
	@FXML 
	private CheckBox eleventh; 
	@FXML 
	private CheckBox twelveth; 
	
	 
	
	
	
	@FXML
	private void initialize() { //an FXML method
		pollListLbl.setText("Open and Closed Polls");
		questionLbl.setText("Question");
		option1Lbl.setText("Option 1");
		option2Lbl.setText("Option 2");
		option3Lbl.setVisible(false);
		option4Lbl.setVisible(false);
		option5Lbl.setVisible(false);
		option6Lbl.setVisible(false);
		option7Lbl.setVisible(false);
		option8Lbl.setVisible(false);
		option9Lbl.setVisible(false);
		option10Lbl.setVisible(false);
		option1Lbl1.setVisible(false);
		option2Lbl1.setVisible(false);
		option3Lbl1.setVisible(false);
		option4Lbl1.setVisible(false);
		option5Lbl1.setVisible(false);
		option6Lbl1.setVisible(false);
		option7Lbl1.setVisible(false);
		option8Lbl1.setVisible(false);
		option9Lbl1.setVisible(false);
		option10Lbl1.setVisible(false);
		op1.setVisible(true);
		op2.setVisible(true);
		op3.setVisible(false);
		op4.setVisible(false);
		op5.setVisible(false);
		op6.setVisible(false);
		op7.setVisible(false);
		op8.setVisible(false);
		op9.setVisible(false);
		op10.setVisible(false);
		preview1But.setText("Preview");
		preview2But.setText("Preview");
		preview3But.setText("Preview");
		preview4But.setText("Preview");
		preview5But.setText("Preview");
		preview6But.setText("Preview");
		result1But.setText("Results");
		result2But.setText("Results");
		result3But.setText("Results");
		result4But.setText("Results");
		result5But.setText("Results");
		result6But.setText("Results");
		newOp.setText("Add Options");
		inc.setText(">");
		dec.setText("<");
		inc1.setText(">");
		dec1.setText("<");
		save.setText("Save");
		edit.setText("Edit");
		view.setText("View");
		ninth.setText("9th");
		tenth.setText("10th");
		eleventh.setText("11th");
		twelveth.setText("12th");
		
		
		
		
		
	}
	
	@FXML //Subtract
	public void handleFirstButtonClick() {

	}
	@FXML //Add
	public void handleSecondButtonClick() {
		
	}
}
