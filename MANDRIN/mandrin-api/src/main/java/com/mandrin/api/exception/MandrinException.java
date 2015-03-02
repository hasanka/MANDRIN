package com.mandrin.api.exception;

/**
 * 
 * @author HasankaMac
 * 
 */
public class MandrinException extends Exception {

	private static final long serialVersionUID = 1L;

	private String code;
	private Throwable cause;

	public MandrinException(String code, Throwable cause) {
		super(code, cause);
		this.code = code;
		this.cause = cause;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}

}
