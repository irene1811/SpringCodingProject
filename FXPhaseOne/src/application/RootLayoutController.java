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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class RootLayoutController {

	private Main mainApp;
	
	private static List<Student> studentList = new ArrayList<Student>();
	private static List<Poll> pollList = new ArrayList<Poll>();
	private static List<Question> questionList = new ArrayList<Question>();
	private static List<Question> questionList0 = new ArrayList<Question>();
	private static List<Question> questionList1 = new ArrayList<Question>();
	private static List<Question> questionList2 = new ArrayList<Question>();
	private static List<Question> questionList3 = new ArrayList<Question>();
	private static List<Question> questionList4 = new ArrayList<Question>();
	private static List<Question> questionList5 = new ArrayList<Question>();
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
	
	int aIndex = 0;
	
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
	private Label question1;
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
	private Button dec11;
	@FXML 
	private Button inc11;
	@FXML 
	private Button save;
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
	private TextField questiontxtfld;
	@FXML 
	private Tab edit;
	@FXML 
	private Tab view; 
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
	private Label question2;
	@FXML 
	private Label poll1Lbl1;
	@FXML 
	private Label poll2Lbl1;
	@FXML 
	private Label poll3Lbl1;
	@FXML 
	private Label poll4Lbl1;
	@FXML 
	private Label poll5Lbl1;
	@FXML 
	private Label poll6Lbl1;
	@FXML 
	private Button preview1But1;
	@FXML 
	private Button preview2But1;
	@FXML 
	private Button preview3But1;
	@FXML 
	private Button preview4But1;
	@FXML 
	private Button preview5But1;
	@FXML 
	private Button preview6But1;
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
	private Button newPoll;
	@FXML 
	private TextField chngPollNm;
	@FXML 
	private Button submit;
	@FXML
	private Label count;
	@FXML 
	private Tab results;
	@FXML 
	private Label question11;
	@FXML 
	private Label option1Lbl11;
	@FXML 
	private Label option2Lbl11;
	@FXML 
	private Label option3Lbl11;
	@FXML 
	private Label option4Lbl11;
	@FXML 
	private Label option5Lbl11;
	@FXML 
	private Label option6Lbl11;
	@FXML 
	private Label option7Lbl11;
	@FXML 
	private Label option8Lbl11;
	@FXML 
	private Label option9Lbl11;
	@FXML 
	private Label option10Lbl11;
	
	@FXML
	private void initialize() { //an FXML method
		adminTb.setDisable(true);
		studentTb.setDisable(true);
		loginTb.setText("Login Please");
		enterAdmin.setText ("Go");
		enterStu.setText("Go");
		adminTb.setText("Admin");
		studentTb.setText("Student");
		studentloginLbl.setText("Student Login");
		adminloginLbl.setText("Admin Login");
		studentUsenmLbl.setText("Username");
		adminUsenmLbl.setText("Username");
		studentPassLbl.setText("Password");
		adminPassLbl.setText("Password");
		pollListLbl.setText("All Polls");
		pollNameLbl.setVisible(true);
		option1Lbl.setText("1");
		option2Lbl.setText("2");
		option3Lbl.setText("3");
		option4Lbl.setText("4");
		option5Lbl.setText("5");
		option6Lbl.setText("6");
		option7Lbl.setText("7");
		option8Lbl.setText("8");
		option1Lbl1.setVisible(true);
		option2Lbl1.setVisible(true);
		option3Lbl1.setVisible(true);
		option4Lbl1.setVisible(true);
		option5Lbl1.setVisible(true);
		option6Lbl1.setVisible(true);
		option7Lbl1.setVisible(true);
		option8Lbl1.setVisible(true);
		op1.setVisible(true);
		op2.setVisible(true);
		op3.setVisible(true);
		op4.setVisible(true);
		op5.setVisible(true);
		op6.setVisible(true);
		op7.setVisible(true);
		op8.setVisible(true);
		option1Lbl.setVisible(true);
		option2Lbl.setVisible(true);
		option3Lbl.setVisible(true);
		option4Lbl.setVisible(true);
		option5Lbl.setVisible(true);
		option6Lbl.setVisible(true);
		option7Lbl.setVisible(true);
		option8Lbl.setVisible(true);
		inc.setText(">");
		dec.setText("<");
		inc1.setText(">");
		dec1.setText("<");
		inc2.setText(">");
		dec2.setText("<");
		save.setText("Save");
		edit.setText("Edit");
		view.setText("View");
		submit.setText("Submit");
		
		//hiding all polls labels except for 1 default starter on admin and student 
		poll2Lbl.setVisible(false);
		poll3Lbl.setVisible(false);
		poll4Lbl.setVisible(false);
		poll5Lbl.setVisible(false);
		poll6Lbl.setVisible(false);
		poll2Lbl1.setVisible(false);
		poll3Lbl1.setVisible(false);
		poll4Lbl1.setVisible(false);
		poll5Lbl1.setVisible(false);
		poll6Lbl1.setVisible(false);
		
		//hiding all poll buttons except for 1 default starter
		preview2But.setVisible(false);
		result2But.setVisible(false);
		preview3But.setVisible(false);
		result3But.setVisible(false);
		preview4But.setVisible(false);
		result4But.setVisible(false);
		preview5But.setVisible(false);
		result5But.setVisible(false);
		preview6But.setVisible(false);
		result6But.setVisible(false);
		preview2But1.setVisible(false);
		preview3But1.setVisible(false);
		preview4But1.setVisible(false);
		preview5But1.setVisible(false);
		preview6But1.setVisible(false);
		//add a new poll to pollList
		pollList.add(defPoll);
		//find out new pollSize
		polltotal = pollList.size();
		//Add a new question to the list of questions inside poll
		Poll firstPoll = pollList.get(pollIndex); // "firstPoll" to shorten code
		//add new question to the question list within poll
		checkQuestionList();		
		addDefQuestion();
		firstPoll.setPollName("Change Poll Name");
		//change the textfield for Poll name to "Change Poll Name"
		chngPollNm.setText(firstPoll.getPollName());
		//change the side Poll label to "New Poll"
		poll1Lbl.setText("New Poll");
		
		//updating qTotal
		List<Question> tempQList = questionList;
		qTotal = tempQList.size();
		changeQuestionNumberLbl();
		displayStudentView();
		
	}
	@FXML
	public void handleIncClick() {
		//save current question
		save();
		qIndex = qIndex +1;
		//if index is greater than total, add a defStu to array list and display, change labels
		//Poll tempPoll = pollList.get(pollIndex);
		//if the current question number is larger than total number of Qs, then add a new question.
		if (qIndex >= qTotal) {
			addDefQuestion();
		}
		//display question at the index 
		displayQuestion();
		displayQuestionView();
		changeQuestionNumberLbl();
	}
	
	@FXML
	public void handleDecClick() {
		save();
		//check if index is already 0
		if (qIndex == 0) {
			displayQuestion();
			displayQuestionView();
			changeQuestionNumberLbl();
		//otherwise change index and display variable
		} else {
			qIndex = qIndex - 1;
			//display record to edit and record on the view page
			displayQuestion();
			displayQuestionView();
			changeQuestionNumberLbl();
		}
	}
	
	public void handleStuIncClick() {
		if (qIndex == questionList.size() - 1) {
			displayStudentView();
			changeQuestionNumberLbl();
		} else {
			qIndex = qIndex + 1;
			displayStudentView();
			changeQuestionNumberLbl();
		}
	}
	@FXML
	public void handleStuDecClick() {
		//check if index is already 0
		if (qIndex == 0) {
			displayStudentView();
			changeQuestionNumberLbl();
		//otherwise change index and display variable
		} else {
			qIndex = qIndex - 1;
			//display
			displayStudentView();
			changeQuestionNumberLbl();
		}
	}
	
	@FXML
	public void handleSaveClick() {
		//save current question
		save();
		Poll tempPoll = pollList.get(pollIndex);
		//Changing the Poll Name
		tempPoll.setPollName(chngPollNm.getText());
		
		//poll labels start at 1, but pollIndex starts at 0
		if(pollIndex == 0) {
			poll1Lbl.setText(tempPoll.getPollName());
			poll1Lbl1.setText(tempPoll.getPollName());
		}
		if(pollIndex == 1) {
			poll2Lbl.setText(tempPoll.getPollName());
			poll2Lbl1.setText(tempPoll.getPollName());
		}
		if(pollIndex == 2) {
			poll3Lbl.setText(tempPoll.getPollName());
			poll3Lbl1.setText(tempPoll.getPollName());
		}
		if(pollIndex == 3) {
			poll4Lbl.setText(tempPoll.getPollName());
			poll4Lbl1.setText(tempPoll.getPollName());
		}
		if(pollIndex == 4) {
			poll5Lbl.setText(tempPoll.getPollName());
			poll5Lbl1.setText(tempPoll.getPollName());
		}
		if(pollIndex == 5) {
			poll6Lbl.setText(tempPoll.getPollName());
			poll6Lbl1.setText(tempPoll.getPollName());
		}
		displayQuestionView();
		displayStudentView();
	}
	
	//create another poll
	@FXML
	public void createNewPoll() {
		checkQuestionList();
		save();
		if (pollList.size() == 6) {
			chngPollNm.setText("Error: Over Limit");
		} else {
			//add a new poll to pollList
			pollList.add(new Poll());
			//fix indexer
			pollIndex = pollList.size() - 1;
			//find out new pollSize
			polltotal = pollList.size();
			//Add a new question to the list of questions inside poll
			Poll tempPoll = pollList.get(pollIndex);
			addDefQuestion();
			chngPollNm.setText(tempPoll.getPollName());
			checkQuestionList();
			List<Question> tempQList = questionList;
			qTotal = tempQList.size();
			qIndex = 0;
			changeQuestionNumberLbl();
			displayQuestion();
			displayQuestionView();
			//Change the poll menu, when new poll is added.
			if(pollIndex == 1) {
				poll2Lbl.setText(tempPoll.getPollName());
				poll2Lbl.setVisible(true);
				preview2But.setVisible(true);
				poll2Lbl1.setText(tempPoll.getPollName());
				poll2Lbl1.setVisible(true);
				preview2But1.setVisible(true);
				result2But.setVisible(true);
			} else if(pollIndex == 2) {
				poll3Lbl.setText(tempPoll.getPollName());
				poll3Lbl.setVisible(true);
				preview3But.setVisible(true);
				poll3Lbl1.setText(tempPoll.getPollName());
				poll3Lbl1.setVisible(true);
				preview3But1.setVisible(true);
				result3But.setVisible(true);
			} else if(pollIndex == 3) {
				poll4Lbl.setText(tempPoll.getPollName());
				poll4Lbl.setVisible(true);
				preview4But.setVisible(true);
				poll4Lbl1.setText(tempPoll.getPollName());
				poll4Lbl1.setVisible(true);
				preview4But1.setVisible(true);
				result4But.setVisible(true);
			} else if(pollIndex == 4) {
				poll5Lbl.setText(tempPoll.getPollName());
				poll5Lbl.setVisible(true);
				preview5But.setVisible(true);
				poll5Lbl1.setText(tempPoll.getPollName());
				poll5Lbl1.setVisible(true);
				preview5But1.setVisible(true);
				result5But.setVisible(true);
			} else if(pollIndex == 5) {
				poll6Lbl.setText(tempPoll.getPollName());
				poll6Lbl.setVisible(true);
				preview6But.setVisible(true);
				poll6Lbl1.setText(tempPoll.getPollName());
				poll6Lbl1.setVisible(true);
				preview6But1.setVisible(true);
				result6But.setVisible(true);
			}
			checkQuestionList();
		}
	}
	
	//Handlers for Preview Button	
	public void previewButtons() {
		//set question Index to 0 so the first question is shown.
		qIndex = 0;
		setPollName();
		//inside the changeQuestionLbl method qTotal will be updated
		checkQuestionList();
		displayQuestion();
		displayQuestionView();
		changeQuestionNumberLbl();
	}
	
	@FXML
	public void handleP0() {
		save();
		//sets the poll index to the right number
		pollIndex = 0;
		previewButtons();
	}
	
	@FXML
	public void handleP1() {
		save();
		//sets the poll index to the right number
		pollIndex = 1;
		previewButtons();
	}
	
	@FXML
	public void handleP2() {
		save();
		//sets the poll index to the right number
		pollIndex = 2;
		previewButtons();
	}
	
	@FXML
	public void handleP3() {
		save();
		//sets the poll index to the right number
		pollIndex = 3;
		previewButtons();
	}
	
	@FXML
	public void handleP4() {
		save();
		//sets the poll index to the right number
		pollIndex = 4;
		previewButtons();
	}
	@FXML
	public void handleP5() {
		save();
		//sets the poll index to the right number
		pollIndex = 5;
		previewButtons();
	}

	public void studentPollLists() {
		//set question Index to 0 so the first question is shown.
		qIndex = 0;
		setPollName();
		//inside the changeQuestionLbl method qTotal will be updated
		displayQuestion();
		displayStudentView();
	}
	@FXML 
	public void handleS0() {
		pollIndex = 0;
		studentPollLists();
	}
	@FXML 
	public void handleS1() {
		pollIndex = 1;
		studentPollLists();
	}
	@FXML 
	public void handleS2() {
		pollIndex=2;
		studentPollLists();
	}
	@FXML 
	public void handleS3() {
		pollIndex=3;
		studentPollLists();
	}
	@FXML 
	public void handleS4() {
		pollIndex=4;
		studentPollLists();
	}
	@FXML 
	public void handleS5() {
		pollIndex=5;
		studentPollLists();
	}
	
	//Make a display
	public void displayQuestion() {
		//get the question list for the poll we are on
		checkQuestionList();
		List<Question> tempQList = questionList;
		
		//set all the text based on the question list
		questiontxtfld.setText(tempQList.get(qIndex).getQuestion());
		op1.setText(tempQList.get(qIndex).getOption1());
		op2.setText(tempQList.get(qIndex).getOption2());
		op3.setText(tempQList.get(qIndex).getOption3());
		op4.setText(tempQList.get(qIndex).getOption4());
		op5.setText(tempQList.get(qIndex).getOption5());
		op6.setText(tempQList.get(qIndex).getOption6());
		op7.setText(tempQList.get(qIndex).getOption7());
		op8.setText(tempQList.get(qIndex).getOption8());
	}
	
	
	public void displayQuestionView() {
		//get the question list for the poll we are on
		checkQuestionList();
		List<Question> tempQList = questionList;
		
		//set all the text based on the question list

		question1.setText(tempQList.get(qIndex).getQuestion());
		option1Lbl1.setText(tempQList.get(qIndex).getOption1());
		option2Lbl1.setText(tempQList.get(qIndex).getOption2());
		option3Lbl1.setText(tempQList.get(qIndex).getOption3());
		option4Lbl1.setText(tempQList.get(qIndex).getOption4());
		option5Lbl1.setText(tempQList.get(qIndex).getOption5());
		option6Lbl1.setText(tempQList.get(qIndex).getOption6());
		option7Lbl1.setText(tempQList.get(qIndex).getOption7());
		option8Lbl1.setText(tempQList.get(qIndex).getOption8());
	}
		
	public void displayStudentView() {
		//get the question list for the poll we are on
		checkQuestionList();
		List<Question> tempQList = questionList;
		
		//set all the text based on the question list
		//question1.setText("meme");
		question2.setText(tempQList.get(qIndex).getQuestion());
		opt1.setText(tempQList.get(qIndex).getOption1());
		opt2.setText(tempQList.get(qIndex).getOption2());
		opt3.setText(tempQList.get(qIndex).getOption3());
		opt4.setText(tempQList.get(qIndex).getOption4());
		opt5.setText(tempQList.get(qIndex).getOption5());
		opt6.setText(tempQList.get(qIndex).getOption6());
		opt7.setText(tempQList.get(qIndex).getOption7());
		opt8.setText(tempQList.get(qIndex).getOption8());

	}
	
	public void changeQuestionNumberLbl() {
		//get the question list for the poll we are on
		checkQuestionList();
		List<Question> tempQList = questionList;
		//disp is always 1 more than qIndex, since qIndex starts at 0
		int disp = qIndex + 1;
		//get the total size of the array list and then change the labels
		qTotal = tempQList.size();
		questionLbl.setText("Question " + disp + " of " + qTotal);
	}
	public void changeStudentLabel() {
		//get the question list for the poll we are on
		checkQuestionList();
		List<Question> tempQList = questionList;
		//disp is always 1 more than qIndex, since qIndex starts at 0
		int disp = qIndex + 1;
		//get the total size of the array list and then change the labels
		qTotal = tempQList.size();
		questionLbl.setText("Question " + disp + " of " + qTotal);
	}
	//saves question
	public void save() {
		//get the question list for the poll we are on
		checkQuestionList();
		Question tempQ = questionList.get(qIndex);
		//set the values in textfields as Questions and options at qIndex
		tempQ.setQuestion(String.valueOf(questiontxtfld.getText()));
		tempQ.setOption1(String.valueOf(op1.getText()));
		tempQ.setOption2(String.valueOf(op2.getText()));
		tempQ.setOption3(String.valueOf(op3.getText()));
		tempQ.setOption4(String.valueOf(op4.getText()));
		tempQ.setOption5(String.valueOf(op5.getText()));
		tempQ.setOption6(String.valueOf(op6.getText()));
		tempQ.setOption7(String.valueOf(op7.getText()));
		tempQ.setOption8(String.valueOf(op8.getText()));
	}
	//method to set the poll name in the text box
	public void setPollName() {
		Poll tempPoll = pollList.get(pollIndex);
		chngPollNm.setText(tempPoll.getPollName());
		pollNameLbl1.setText(tempPoll.getPollName());
	}
	//method to add a default question to any qeustion list
	public void addDefQuestion() {
		checkQuestionList();
		questionList.add(new Question());
	}
	//method to check which question list is needed
	public void checkQuestionList() {
		if (pollIndex == 0) {
			questionList = questionList0;
		} else if (pollIndex == 1) {
			questionList = questionList1;
		} else if (pollIndex == 2) {
			questionList = questionList2;
		} else if (pollIndex == 3) {
			questionList = questionList3;
		} else if (pollIndex == 4) {
			questionList = questionList4;
		} else if (pollIndex == 5) {
			questionList = questionList5;
		}
	}
	//AdminLogin Methods	
	public void adminLogin() {
		String use = adminUsenmTxtfld.getText();
		String pass = adminPassTxtfld.getText();
			if (use.equals("bob") && pass.equals("blue")) {
				adminTb.setDisable(false);
				pollIndex = 0;
				qIndex = 0;
			}else {
				adminTb.setDisable(true);
			}	
	}	
	//Student login method that reads from the csv file
	public void stuLogin() {
		String use1 = studentUsenmTxtfld.getText();
		String pass1 = studentPassTxtfld.getText();
			if (use1.equals(studentList.get(0).getStudentID()) && pass1.equals(studentList.get(0).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(1).getStudentID()) && pass1.equals(studentList.get(1).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(2).getStudentID()) && pass1.equals(studentList.get(2).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(3).getStudentID()) && pass1.equals(studentList.get(3).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(4).getStudentID()) && pass1.equals(studentList.get(4).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(5).getStudentID()) && pass1.equals(studentList.get(5).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(6).getStudentID()) && pass1.equals(studentList.get(6).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(7).getStudentID()) && pass1.equals(studentList.get(7).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(8).getStudentID()) && pass1.equals(studentList.get(8).getPassword())) {
				studentTb.setDisable(false);
			}else if (use1.equals(studentList.get(9).getStudentID()) && pass1.equals(studentList.get(9).getPassword())) {
					studentTb.setDisable(false);
			} else {
				studentTb.setDisable(true);
			}
	}
	//handles the login buttons for admin and student  
	@FXML 
	public void handleloginButton() {
		pollIndex = 0;
		qIndex = 0;
		adminLogin();
	}
	@FXML
	public void handlestulog() {
		pollIndex = 0;
		qIndex = 0;
		displayStudentView();
		stuLogin();
	}
	
	//this makes sure the user can only choose one option 
	ToggleGroup group = new ToggleGroup();
	int count1 = 0;
	int count2 = 0;
	int count3= 0;
	int count4= 0;
	int count5= 0;
	int count6= 0;
	int count7= 0;
	int count8= 0;
	
	@FXML
	public void handleRBs() {
		opt1.setToggleGroup(group);	
		opt2.setToggleGroup(group);
		opt3.setToggleGroup(group);
		opt4.setToggleGroup(group);
		opt5.setToggleGroup(group);
		opt6.setToggleGroup(group);
		opt7.setToggleGroup(group);
		opt8.setToggleGroup(group);
		
		RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();	
	}
	//sumbit method
	@FXML 
	public void handlesub () {
		checkQuestionList();
		List<Question> tempQList = questionList;
		if (opt1.isSelected() == true) {
			count1 = count1 + 1;
		}else if (opt1.isSelected() == false) {
			count1 = 0;
		}
		if (opt2.isSelected() == true) {
			count2 = count2 + 1;
		}else {
			count2 = 0;
		}	
		if (opt3.isSelected() == true) {
			count3 = count3 + 1;
		}else {
			count3 = 0;
		}
		if (opt4.isSelected() == true) {
			count4 = count4 + 1;
		}else {
			count4 = 0;
		}
		if (opt5.isSelected() == true) {
			count5 = count5 + 1;
		}else {
			count5 = 0;
		}
		if (opt6.isSelected() == true) {
			count6 = count6 + 1;
		}else {
			count6 = 0;
		}
		if (opt7.isSelected() == true) {
			count7 = count7 + 1;
		}else {
			count7 = 0;
		}
		if (opt8.isSelected() == true) {
			count8 = count8 + 1;
		}else {
			count8 = 0;
		}
		
		
		question11.setText(tempQList.get(qIndex).getQuestion());
		option1Lbl11.setText(Integer.toString(count1));
		option2Lbl11.setText(Integer.toString(count2));
		option3Lbl11.setText(Integer.toString(count3));
		option4Lbl11.setText(Integer.toString(count4));
		option5Lbl11.setText(Integer.toString(count5));
		option6Lbl11.setText(Integer.toString(count6));
		option7Lbl11.setText(Integer.toString(count7));
		option8Lbl11.setText(Integer.toString(count8));
	
	}	
}
