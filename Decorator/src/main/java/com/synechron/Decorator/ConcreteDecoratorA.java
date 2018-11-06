package com.synechron.Decorator;

public class ConcreteDecoratorA extends Decorator{

	public void operate() {
		getComponent().operate();
		System.out.println("ConcreteDecoratorA operates");
		
	}

}
