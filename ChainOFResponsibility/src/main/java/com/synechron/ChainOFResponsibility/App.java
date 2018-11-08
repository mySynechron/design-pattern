package com.synechron.ChainOFResponsibility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Doctor doctors = new FirstDoctor();
        doctors.setNext(new SecondDoctor());
        doctors.getNext().setNext(new ThirdDoctor());
        
        Patient patient = new Patient("Nishant",38);
        Patient patient2 = new Patient("Niranjan",50);
        doctors.treatPatient(patient);
        doctors.treatPatient(patient2);
    }
}
