package com.synechron.Template;

public abstract class PastaDish {
	public void makeRecipe() {
		boilWater();
		addPasta();
		cookPasta();
		drainAndPlate();
		addProtein();
		addSauce();
		addGernish();
	}
	
	private void boilWater(){
		System.out.println("water is bioled");
	}
	
	private void cookPasta() {
		System.out.println("Pasta is cooked");
	}
	
	private void drainAndPlate() {
		System.out.println("Pasta is drained and kept on plate");
	}
	
	private  void addPasta() {
		System.out.println("Pasta is added");
	}
	
	
	protected abstract void addSauce();
	
	protected abstract void addProtein();
	
	protected abstract void addGernish();

}
