package com.synechron;

public class ErrorPrinter extends Printer{

	@Override
	protected Log createLogger() {
		// TODO Auto-generated method stub
		return new ErrorLog();
	}

}
