package application;

public class Student {
	//fields for student class 
	private String studentID;
	private String firstName;
	private String lastName;
	private String grade;
	private String password;
	

//Constructor
	//Default
public Student() {
	this.studentID = "";
	this.firstName = "";
	this.lastName = "";
	this.grade = "";
	this.password = "";
}

public Student(String studentID, String firstName, String lastName, String grade, String password) {
	this.studentID = studentID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.grade = grade;
	this.password = password;
}

//Getter and Setters

public String getStudentID() {
	return studentID;
}

public void setStudentID(String studentID) {
	this.studentID = studentID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}