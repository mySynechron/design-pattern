package com.synechron.ChainOFResponsibility;

public class ThirdDoctor extends Doctor{

	
	@Override
	protected void handlePatient(Patient patient) {
		int age = patient.getAge();
		if(age>40 && age<60){
			System.out.println(patient.getName()+" treated at third Doctor");
			patient.setTreated(true);
		}
		
	}
	

}
