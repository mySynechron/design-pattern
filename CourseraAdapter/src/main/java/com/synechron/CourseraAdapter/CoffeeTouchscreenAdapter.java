package com.synechron.CourseraAdapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
    private OldCoffeeMachine oldCoffeeMachine;
	public CoffeeTouchscreenAdapter() {
		oldCoffeeMachine = new OldCoffeeMachine();
	}

	public void chooseFirstSelection() {
		oldCoffeeMachine.selectA();
	}

	public void chooseSecondSelection() {
		oldCoffeeMachine.selectB();
	}

}
