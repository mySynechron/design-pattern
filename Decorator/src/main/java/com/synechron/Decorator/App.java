package com.synechron.Decorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        concreteDecoratorA.setComponent(component);
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.operate();
        
    }
}
