package com.mandrin.controller.error_handler;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mandrin.api.exception.MandrinException;
import com.mandrin.api.exception.MandrinExceptionCode;

/**
 * 
 * @author HasankaMac
 * 
 */
@ControllerAdvice
public class GlobalExceptionController {

	@Autowired
    private MessageSource errorMessageSource;
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(MandrinException.class)
	public ErrorDTO handleCustomException(MandrinException ex) {
		String errorMessage = errorMessageSource.getMessage(ex.getCode(), null, Locale.getDefault());
		return new ErrorDTO(errorMessage);
	}

	@ResponseBody
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ErrorDTO handleAllException(Exception ex) {
		String errorMessage = errorMessageSource.getMessage(MandrinExceptionCode.Common.UNKNOWN, null, Locale.getDefault());
		return new ErrorDTO(errorMessage);
	}

}
