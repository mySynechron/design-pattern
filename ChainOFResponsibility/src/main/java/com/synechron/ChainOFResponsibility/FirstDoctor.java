package com.synechron.ChainOFResponsibility;

public class FirstDoctor extends Doctor{

	@Override
	protected void handlePatient(Patient patient) {
		int age = patient.getAge();
		if(age>0 && age<6){
			System.out.println(patient.getName()+" treated at first Doctor");
			patient.setTreated(true);
		}
		
	}

		
}
