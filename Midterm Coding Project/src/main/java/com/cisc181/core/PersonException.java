package com.cisc181.core;

public class PersonException extends Exception {

	private Person person;

	public PersonException() {
		super();
	}

	public PersonException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonException(String message) {
		super(message);
	}
	public PersonException(String message, Person person) {
		super(message + " : " +  person.toString());
	}
	public PersonException(Throwable cause) {
		super(cause);
	}
	
}