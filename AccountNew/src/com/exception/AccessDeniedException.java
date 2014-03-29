package com.exception;

/**
 * This class demonstrate AccessDeniedException(Custom Exception) and extends
 * RuntimeException.
 * 
 * @author Chandrabhan singh
 * @version 1.1
 * 
 */
public class AccessDeniedException extends RuntimeException {

	/**
	 * This is Srting parametries cunstructor to super class.
	 * 
	 */

	public AccessDeniedException(String message) {
		super(message);
	}

}
