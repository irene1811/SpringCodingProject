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
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;


public class RootLayoutController {

	private Main mainApp;
	private static List<Student> studentList = new ArrayList<Student>();
	private static List<Poll> pollList = new ArrayList<Poll>();
	Poll defPoll = new Poll();
	int pollIndex = 0;
	int polltotal;
	int qIndex = 0;
	int qTotal;
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String Option5;
	private String Option6;
	private String Option7;
	private String Option8;
	private String Option9;
	private String Option10;
	
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
	private Tab loginTb;
	@FXML
	private Tab adminTb; 
	@FXML 
	private Tab studentTb; 
	@FXML 
	private Tab edit1;
	@FXML 
	private Label studentloginLbl;
	@FXML 
	private Label adminloginLbl;
	@FXML 
	private Label studentUsenmLbl; 
	@FXML 
	private Label studentPassLbl; 
	@FXML 
	private TextField studentUsenmTxtfld;
	@FXML 
	private PasswordField studentPassTxtfld; 
	@FXML 
	private Label adminUsenmLbl; 
	@FXML 
	private Label adminPassLbl; 
	@FXML 
	private TextField adminUsenmTxtfld;
	@FXML 
	private PasswordField adminPassTxtfld; 
	@FXML
	private Label pollListLbl;
	@FXML 
	private Label pollNameLbl;
	@FXML
	private Label pollListLbl1;
	@FXML 
	private Label pollNameLbl1;
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
	private Button enterStu;
	@FXML 
	private Button enterAdmin;
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
	private Button inc2;
	@FXML 
	private Button dec2;
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
	private Label questionLbl2;
	@FXML 
	private Label option1Lbl2;
	@FXML 
	private Label option2Lbl2;
	@FXML 
	private Label option3Lbl2;
	@FXML 
	private Label option4Lbl2;
	@FXML 
	private Label option5Lbl2;
	@FXML 
	private Label option6Lbl2;
	@FXML 
	private Label option7Lbl2;
	@FXML 
	private Label option8Lbl2;
	@FXML 
	private Label option9Lbl2;
	@FXML 
	private Label option10Lbl2;
	@FXML  
	private RadioButton opt1;
	@FXML  
	private RadioButton opt2;
	@FXML  
	private RadioButton opt3;
	@FXML  
	private RadioButton opt4;
	@FXML  
	private RadioButton opt5;
	@FXML  
	private RadioButton opt6;
	@FXML  
	private RadioButton opt7;
	@FXML  
	private RadioButton opt8;
	@FXML  
	private RadioButton opt9;
	@FXML  
	private RadioButton opt10;
	@FXML 
	private TextField chngPollNm;
	
	@FXML
	private void initialize() { //an FXML method
		pollList.add(defPoll);
		polltotal = pollList.size();
		displayDefPoll();
		changeQuestionNumberLbl();
		studentloginLbl.setText("Student Login");
		adminloginLbl.setText("Admin Login");
		studentUsenmLbl.setText("Username");
		adminUsenmLbl.setText("Username");
		studentPassLbl.setText("Password");
		adminPassLbl.setText("Password");
		pollListLbl.setText("Open and Closed Polls");
		pollNameLbl.setVisible(false);
		option1Lbl.setText("1");
		option2Lbl.setText("2");
		option3Lbl.setText("3");
		option4Lbl.setText("4");
		option5Lbl.setText("5");
		option6Lbl.setText("6");
		option7Lbl.setText("7");
		option8Lbl.setText("8");
		option9Lbl.setText("9");
		option10Lbl.setText("10");
		option1Lbl1.setVisible(true);
		option2Lbl1.setVisible(true);
		option3Lbl1.setVisible(true);
		option4Lbl1.setVisible(true);
		option5Lbl1.setVisible(true);
		option6Lbl1.setVisible(true);
		option7Lbl1.setVisible(true);
		option8Lbl1.setVisible(true);
		option9Lbl1.setVisible(true);
		option10Lbl1.setVisible(true);
		op1.setVisible(true);
		op2.setVisible(false);
		op3.setVisible(false);
		op4.setVisible(false);
		op5.setVisible(false);
		op6.setVisible(false);
		op7.setVisible(false);
		op8.setVisible(false);
		op9.setVisible(false);
		op10.setVisible(false);
		option1Lbl.setVisible(true);
		option2Lbl.setVisible(false);
		option3Lbl.setVisible(false);
		option4Lbl.setVisible(false);
		option5Lbl.setVisible(false);
		option6Lbl.setVisible(false);
		option7Lbl.setVisible(false);
		option8Lbl.setVisible(false);
		option9Lbl.setVisible(false);
		option10Lbl.setVisible(false);
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
		
		
		
		
		
		//Add a new question each time you initialize.
		
	}
	
	
	//Make a display
	public void displayDefPoll() {
		//make poll name visibile for default poll
		pollNameLbl.setVisible(true);
		pollNameLbl.setText(defPoll.getPollName());
		//add a default quesiton so default poll is not empty
		defPoll.addDefQuestion();
		
		Poll tempPoll = defPoll;
		List<Question> tempQList = tempPoll.getQuestionList();
		qTotal = tempQList.size();
	}
	
	//Make a display
	public void displayQuestion() {
		//get the question list for the poll we are on
		Poll tempPoll = defPoll;
		List<Question> tempQList = tempPoll.getQuestionList();
		
		questiontxtfld.setText(tempQList.get(qIndex).getQuestion());
		op1.setText(tempQList.get(qIndex).getOption1());
		op2.setText(tempQList.get(qIndex).getOption2());
		op3.setText(tempQList.get(qIndex).getOption3());
		op4.setText(tempQList.get(qIndex).getOption4());
		op5.setText(tempQList.get(qIndex).getOption5());
		op6.setText(tempQList.get(qIndex).getOption6());
		op7.setText(tempQList.get(qIndex).getOption7());
		op8.setText(tempQList.get(qIndex).getOption8());
		op9.setText(tempQList.get(qIndex).getOption9());
		op10.setText(tempQList.get(qIndex).getOption10());
		
	}
	
	
	//create a default empty question when the admin makes a new question

	@FXML
	public void handleIncClick() {
		//add stuff that changes quetion number
		qIndex = qIndex + 1;
		//if index is greater than total, add a defStu to array list and display, change labels
		Poll tempPoll = defPoll;
		if (qIndex >= qTotal) {
			tempPoll.addDefQuestion();
		}
		//display question at the index 
		displayQuestion();
		changeQuestionNumberLbl();
	}
	
	@FXML
	public void handleDecClick() {
		//check if index is already 0
		if (qIndex == 0) {
			displayQuestion();
			changeQuestionNumberLbl();
		//otherwise change index and display variable
		} else {
			qIndex = qIndex - 1;
			//display record to edit and record on the view page
			displayQuestion();
			changeQuestionNumberLbl();
		}
	}
	
	
	public void changeQuestionNumberLbl() {
		//Poll tempPoll = defPoll;
		List<Question> tempQList = Poll.getQuestionList();
		int disp = qIndex + 1;
		//get the total size of the array list and then change the labels
		qTotal = tempQList.size();
		questionLbl.setText("Question " + disp + " of " + qTotal);
	}
	
	//inside increment button handler, add a new blank default question

	
	//inside increment button handler, add a new blank default question	
	@FXML
	public void handleSaveClick() {
		//get the text of each text field, set it equal to the name var, and put it in the object
		Question = String.valueOf(questiontxtfld.getText());
		questiontxtfld.setText(Question);
		Option1 = String.valueOf(op1.getText());
		op1.setText(Option1);
		Option2 = String.valueOf(op2.getText());
		op2.setText(Option2);
		Option3 = String.valueOf(op3.getText());
		op3.setText(Option3);
		Option4 = String.valueOf(op4.getText());
		op4.setText(Option4);
		Option5 = String.valueOf(op5.getText());
		op5.setText(Option5);
		Option6 = String.valueOf(op6.getText());
		op6.setText(Option6);
		Option7 = String.valueOf(op7.getText());
		op7.setText(Option7);
		Option8 = String.valueOf(op8.getText());
		op8.setText(Option8);
		Option9 = String.valueOf(op9.getText());
		op9.setText(Option9);
		Option10 = String.valueOf(op10.getText());
		op10.setText(Option10);

		//make the temporary student class and add it to the list
		Question tempQuestion =  new Question(Question, Option1, Option2, Option3, Option4, Option5, Option6, Option7, Option8, Option9, Option10);
		List<Question> tempQList = Poll.getQuestionList();
		tempQList.set(qIndex, tempQuestion);

		//Login Methods
	@FXML	
	public void handleLogin() {
		String user; 
		String pass;
		
		user=adminUsenmTxtfld.getText();
		pass=adminPassTxtfld.getText();
		
		if (user.equals("bob")) {
			
			

		//if(user.equals("blue") && pass.equals("bob") ){
		  //  adminloginLbl.setText("you in");
		//}
		//else{
		  //  adminUsenmTxtfld.setText("Please try again.");
		}   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}	

}
