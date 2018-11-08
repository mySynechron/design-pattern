package com.synechron.State;

public enum State {
	IdleState{
		@Override
		public void insertDollar(VendingMachine vendingMachine)
		{
			System.out.println("1 dollar is inserted");
			vendingMachine.setCurrentState(HasOneDollarState);
		}
		@Override
		public void ejectDollar(VendingMachine vendingMachine)
		{
			System.out.println("Dollars cant be ejected");
		}
		@Override
		public void dispense(VendingMachine vendingMachine)
		{
			System.out.println("Dispense is not supported at this stage, \n Please insert dollar first");
		}
	}
	, HasOneDollarState{
		@Override
		public void insertDollar(VendingMachine vendingMachine)
		{
			System.out.println("Dollar is already present there");
		}
		@Override
		public void ejectDollar(VendingMachine vendingMachine)
		{
			System.out.println("Ejecting coin");
			//vendingMachine.decrementCount();
			vendingMachine.setCurrentState(IdleState);
		}
		@Override
		public void dispense(VendingMachine vendingMachine)
		{
			if(vendingMachine.getCount()>0)
			{
				System.out.println("Dispensing product");
				vendingMachine.decrementCount();
				vendingMachine.setCurrentState(IdleState);
			}
			else
			{
				System.out.println("out of stock");
				System.out.println("returning dollar");
				vendingMachine.setCurrentState(OutOfStockState);

			}
		}
	}, OutOfStockState{
		@Override
		public void insertDollar(VendingMachine vendingMachine)
		{
			System.out.println("Dollar is not accepted as the product is out of stock");
		}
		@Override
		public void ejectDollar(VendingMachine vendingMachine)
		{
			System.out.println("Dollar is not present");			
		}
		@Override
		public void dispense(VendingMachine vendingMachine)
		{
			System.out.println("product is not available");	
		}
	};
	
	public abstract void insertDollar(VendingMachine vendingMachine);
	public abstract void ejectDollar(VendingMachine vendingMachine);
	public abstract void dispense(VendingMachine vendingMachine);
}
