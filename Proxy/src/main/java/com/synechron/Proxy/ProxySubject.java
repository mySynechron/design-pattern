package com.synechron.Proxy;

public class ProxySubject implements Subject{
    Subject subject = null;
	public void request() {
		subject = new RealSubject();
		subject.request();
		
	}

}
