package com.synechron.Proxy;

public class RealSubject implements Subject{

	public void request() {
		System.out.println("Request method of RealSubject is called");
	}
}
