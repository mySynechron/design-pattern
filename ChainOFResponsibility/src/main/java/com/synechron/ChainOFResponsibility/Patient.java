package com.synechron.ChainOFResponsibility;

public class Patient {
	private String name;
	private int age;
	private boolean treated = false;
	
	public Patient(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + "]";
	}
	public boolean isTreated() {
		return treated;
	}
	public void setTreated(boolean treated) {
		this.treated = treated;
	}
	

}
