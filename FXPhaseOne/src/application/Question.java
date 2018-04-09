package application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Question {
	private String Question;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String Option5;
	private String Option6;
	private String Option7;
	private String Option8;
	
	//default class
	public Question() {
		Question = "";
		Option1 = "";
		Option2 = "";
		Option3 = "";
		Option4 = "";
		Option5 = "";
		Option6 = "";
		Option7 = "";
		Option8 = "";
	}
	
	public Question(String q, String o1, String o2, String o3, String o4, String o5, String o6, String o7, String o8) {
		this.Question = q;
		this.Option1 = o1;
		this.Option2 = o2;
		this.Option3 = o3;
		this.Option4 = o4;
		this.Option5 = o5;
		this.Option6 = o6;
		this.Option7 = o7;
		this.Option8 = o8;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String Question) {
		this.Question = Question;
	}

	public String getOption1() {
		return Option1;
	}

	public void setOption1(String Option1) {
		this.Option1 = Option1;
	}

	public String getOption2() {
		return Option2;
	}

	public void setOption2(String Option2) {
		this.Option2 = Option2;
	}

	public String getOption3() {
		return Option3;
	}

	public void setOption3(String Option3) {
		this.Option3 = Option3;
	}

	public String getOption4() {
		return Option4;
	}

	public void setOption4(String Option4) {
		this.Option4 = Option4;
	}

	public String getOption5() {
		return Option5;
	}

	public void setOption5(String Option5) {
		this.Option5 = Option5;
	}

	public String getOption6() {
		return Option6;
	}

	public void setOption6(String Option6) {
		this.Option6 = Option6;
	}

	public String getOption7() {
		return Option7;
	}

	public void setOption7(String Option7) {
		this.Option7 = Option7;
	}

	public String getOption8() {
		return Option8;
	}

	public void setOption8(String Option8) {
		this.Option8 = Option8;
	}

	
	
}
