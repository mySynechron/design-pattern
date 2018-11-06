package com.synechron;

public class SystemLog implements Log{

	public void log(String message) {
		System.out.println("System is printing::"+message);
		
	}

}
