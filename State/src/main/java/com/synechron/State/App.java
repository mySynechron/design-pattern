package com.synechron.State;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        VendingMachine machine = new VendingMachine(2);
        machine.dispenseProduct();
        machine.insertDollar();
        machine.dispenseProduct();
        machine.dispenseProduct();
        
        
    }
}
