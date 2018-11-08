package com.synechron.ChainOFResponsibility;

public class SecondDoctor extends Doctor{

	@Override
	protected void handlePatient(Patient patient) {
		int age = patient.getAge();
		if(age>5 && age<41){
			System.out.println(patient.getName()+" treated at sencond Doctor");
			patient.setTreated(true);
		}
		
	}
	
}
