package application;

import java.util.ArrayList;
import java.util.List;

public class Poll {
	private String pollName;

	
	public Poll() {
		pollName = "New Poll";
	}
	
	public Poll(String pName) {
		this.pollName = pName;

	}

	public String getPollName() {
		return pollName;
	}

	public void setPollName(String pollName) {
		this.pollName = pollName;
	}

	
}
