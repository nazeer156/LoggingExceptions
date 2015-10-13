package com.indus.training.exceptions;

public class CalciException extends Exception {

	public CalciException() {
		super();
	}

	public CalciException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CalciException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CalciException(String arg0) {
		super(arg0);
	}

	public CalciException(Throwable arg0) {
		super(arg0);
	}

}
