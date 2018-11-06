package com.synechron.FactoryMethod;

import com.synechron.ErrorPrinter;
import com.synechron.SystemPrinter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] SystemPrinter )
    {
        System.out.println( "Hello World!" );
        ErrorPrinter errorPrinter = new ErrorPrinter();
        errorPrinter.print("This is error");
        SystemPrinter systemPrinter = new SystemPrinter();
        systemPrinter.print("This is System output");
        
    }
}
