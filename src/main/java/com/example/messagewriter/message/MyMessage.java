package com.example.messagewriter.message;

import java.io.Serializable;

public class MyMessage implements Serializable{

	private String text;
	
	public MyMessage() {}

	public MyMessage(String text) {
		super();
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
		return "MyMessage [text=" + text + "]";
	}
	
}
