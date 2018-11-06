package com.synechron.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Subject subject = new ProxySubject();
        subject.request();
    }
}
