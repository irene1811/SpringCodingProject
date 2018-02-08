package application;

public class Student {
	//fields for student class 
	private int studentID;
	private int password;
	private int grade;

//Constructor
	//Default
public Student() {
	studentID = 0;
	password = 0;
	grade = 0;
}

public Student(int ID, int pw, int grd) {
	studentID = ID;
	password = pw;
	grade = grd;
}

//Getters and Setters
public int getStudentID() {
	return studentID;
}

public void setStudentID(int studentID) {
	this.studentID = studentID;
}

public int getPassword() {
	return password;
}

public void setPassword(int password) {
	this.password = password;
}

public int getGrade() {
	return grade;
}

public void setGrade(int grade) {
	this.grade = grade;
}


}