package com.synechron.ChainOFResponsibility;

public abstract class Doctor {

	private Doctor next;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor getNext() {
		return next;
	}
	public void setNext(Doctor next) {
		this.next = next;
	}
	

	public void treatPatient(Patient patient) {
		Doctor doctor = null;
		handlePatient(patient);
		if(!patient.isTreated()) {
		 if((doctor = getNext())!=null) {
			 doctor.treatPatient(patient);
		}
		else {
			System.out.println(patient.getName()+" can't be treated here");
		}
	}
		
	}

	protected abstract void handlePatient(Patient patient);
	
}
