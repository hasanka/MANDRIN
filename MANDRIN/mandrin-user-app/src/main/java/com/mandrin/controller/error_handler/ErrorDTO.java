package com.mandrin.controller.error_handler;

import java.io.Serializable;

/**
 * 
 * @author HasankaMac
 * 
 */
public class ErrorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String errorMsg;

	private ErrorDTO(){}
	
	public ErrorDTO(String msg){
		this();
		errorMsg = msg;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
