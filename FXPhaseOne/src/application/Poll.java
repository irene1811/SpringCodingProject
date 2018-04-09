package application;

import java.util.ArrayList;
import java.util.List;

public class Poll {
	private String pollName;
	boolean Open;
	boolean Ninth;
	boolean Tenth;
	boolean Eleventh;
	boolean Twelveth;
	//private static List<Question> questionList;
	
	public Poll() {
		pollName = "New Poll";
		Open = false;
		Ninth = true;
		Tenth = true;
		Eleventh = true;
		Twelveth = true;
		//questionList = new ArrayList<Question>();
	}
	
	public Poll(String pName, boolean op, boolean nin, boolean ten, boolean ele, boolean twe, List<Question> qlist) {
		this.pollName = pName;
		this.Open = op;
		this.Ninth = nin;
		this.Tenth = ten;
		this.Eleventh = ele;
		this.Twelveth = twe;
		//this.questionList = qlist;
	}

	public String getPollName() {
		return pollName;
	}

	public void setPollName(String pollName) {
		this.pollName = pollName;
	}

	public boolean isOpen() {
		return Open;
	}

	public boolean isNinth() {
		return Ninth;
	}

	public void setNinth(boolean ninth) {
		Ninth = ninth;
	}

	public boolean isTenth() {
		return Tenth;
	}

	public void setTenth(boolean tenth) {
		Tenth = tenth;
	}

	public boolean isEleventh() {
		return Eleventh;
	}

	public void setEleventh(boolean eleventh) {
		Eleventh = eleventh;
	}

	public boolean isTwelveth() {
		return Twelveth;
	}

	public void setTwelveth(boolean twelveth) {
		Twelveth = twelveth;
	}

	public void setOpen(boolean open) {
		Open = open;
	}

//	public List<Question> getQuestionList() {
//		return questionList;
//	}
//
//	public void setQuestionList(List<Question> questionList) {
//		Poll.questionList = questionList;
//	}
//	
//	public void addDefQuestion() {
//		questionList.add(new Question());
		
//	}
}
