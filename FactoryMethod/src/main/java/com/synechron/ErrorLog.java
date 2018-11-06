package com.synechron;

public class ErrorLog implements Log{

	public void log(String message) {
		System.err.println("Error is printing::"+message);
		
	}

}
