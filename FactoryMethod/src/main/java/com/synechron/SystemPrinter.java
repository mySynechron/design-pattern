package com.synechron;

public class SystemPrinter extends Printer{

	@Override
	protected Log createLogger() {
		// TODO Auto-generated method stub
		return new SystemLog();
	}

}
