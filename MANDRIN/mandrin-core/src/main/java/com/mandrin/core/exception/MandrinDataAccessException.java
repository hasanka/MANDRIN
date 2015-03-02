package com.mandrin.core.exception;

import com.mandrin.api.exception.MandrinException;

/**
 * 
 * @author HasankaMac
 *
 */
public class MandrinDataAccessException extends MandrinException {

	private static final long serialVersionUID = 1L;

	public MandrinDataAccessException(String code, Throwable cause) {
		super(code, cause);
	}

	
	
}
