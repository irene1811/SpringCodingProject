package application;

import java.util.ArrayList;
import java.util.List;

public class Poll {
	private String pollName;
	boolean Open;
	private static List<Question> questionList;
	
	public Poll() {
		pollName = "";
		Open = true;
		questionList = new ArrayList<Question>();
	}
	
	public Poll(String pName, boolean op, List<Question> qlist) {
		this.pollName = pName;
		this.Open = op;
		this.questionList = qlist;
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

	public void setOpen(boolean open) {
		Open = open;
	}

	public static List<Question> getQuestionList() {
		return questionList;
	}

	public static void setQuestionList(List<Question> questionList) {
		Poll.questionList = questionList;
	}
	
	
}
