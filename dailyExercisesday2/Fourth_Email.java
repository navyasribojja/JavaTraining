package com.java.dailyExercisesday2;

public class Fourth_Email extends Third_Document{
	 private String Sender;
	 private String Receiver;
	 private String Title;

	public Fourth_Email() {
		super();
	}
	
	public Fourth_Email(String sender, String receiver, String title , String text) {
		super();
		text =text;
		Sender = sender;
		Receiver = receiver;
		Title = title;
	}

	public String getSender() {
		return Sender;
	}

	public void setSender(String sender) {
		Sender = sender;
	}

	public String getReceiver() {
		return Receiver;
	}

	public void setReceiver(String receiver) {
		Receiver = receiver;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	
	@Override
	public String toString() {
		return "Sender=" + Sender+"\n" + "Receiver=" + Receiver+"\n" + "Title=" + Title +"\n"+ "Body :"+getText();
	}

	public static void main(String[] args) {
		
	Fourth_Email E1 = new Fourth_Email();
	E1.setSender("Manasa");
	E1.setReceiver("Pallavi");
	E1.setTitle("Subject");
	E1.setText("Hi How are you?");
	System.out.println(E1);
	}


	}
