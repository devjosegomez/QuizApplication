package com.quizapplication.model;

public class Question {
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	Answer answer;
	
	public Question(String question, String option1, String option2, String option3, String option4, Answer answer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	
	//getters and setter
	public String getQuestion() {
		return this.question;
	}
	
	public String getOption1() {
		return this.option1;
	}
	
	public String getOption2() {
		return this.option2;
	}
	
	public String getOption3() {
		return this.option3;
	}
	
	public String getOption4() {
		return this.option4;
	}
	
	public Answer getAnswer() {
		return this.answer;
	}
	
}
