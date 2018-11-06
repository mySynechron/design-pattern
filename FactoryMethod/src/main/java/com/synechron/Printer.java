package com.synechron;

public abstract class Printer {
	
	public void print(String message)
	{
		System.out.println("Looger is goint to be created");
		createLogger().log(message);
		System.out.println("Looger has been printed");
		
	}
	protected abstract Log createLogger();
    
}
