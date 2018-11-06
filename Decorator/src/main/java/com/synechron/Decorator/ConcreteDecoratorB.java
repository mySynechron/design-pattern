package com.synechron.Decorator;

public class ConcreteDecoratorB extends Decorator{

	public void operate() {
		getComponent().operate();
		System.out.println("ConcreteDecoratorB operates");
		
	}

}
