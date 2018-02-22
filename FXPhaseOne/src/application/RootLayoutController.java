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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

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
	private Label dummy;
	
	
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
