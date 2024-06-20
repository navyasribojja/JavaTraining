package com.java.dailyExercisesday2;

public class Third_Document {
	private String text;
	
	public Third_Document() {
		super();
	}

	public Third_Document(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
	
	public static void main(String args[])
	{
		
		Third_Document td = new Third_Document();

		td.setText("This the document");
		System.out.println(td);
	}
	
	

}