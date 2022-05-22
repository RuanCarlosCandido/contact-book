package org.models.customExceptions;

public class FullContactBookException extends Exception {

	private static final long serialVersionUID = 1L;

	public FullContactBookException() {
		super();
	}

	@Override
	public String toString() {
		return "FullContactBook";
	}

}
