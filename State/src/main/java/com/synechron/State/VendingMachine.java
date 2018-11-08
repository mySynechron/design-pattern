package com.synechron.State;

public class VendingMachine {
	private State currentState;
	private int count;
	public int getCount() {
		return count;
	}

	private double money = 0;
	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public VendingMachine(int count) {
		if(count>0)
		{
			this.count = count;
			currentState = State.IdleState;
		}
		else
		{
			currentState = State.OutOfStockState;
		}
	}

	
	public void decrementCount()
	{
		count--;
	}
	
	public void insertDollar()
	{
		currentState.insertDollar(this);
	}
	
	public void ejectDollar()
	{
		currentState.ejectDollar(this);
	}
	
	public void dispenseProduct()
	{
		currentState.dispense(this);
	}

}
