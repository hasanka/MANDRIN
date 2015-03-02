package com.mandrin.controller.error_handler;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private final Logger LOG = LoggerFactory.getLogger(GlobalExceptionController.class);
	
	@Autowired
    private MessageSource errorMessageSource;
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(MandrinException.class)
	public ErrorDTO handleCustomException(MandrinException ex) {
		LOG.info("Mandrin Exception detected.code["+ex.getCode()+"]");
		String errorMessage = errorMessageSource.getMessage(ex.getCode(), null, Locale.getDefault());
		LOG.info("Sending custome error message to view.error message["+errorMessage+"]");
		return new ErrorDTO(errorMessage);
	}

	@ResponseBody
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ErrorDTO handleAllException(Exception ex) {
		LOG.info("Unknown Exception detected.Exception message["+ex.getMessage()+"],Exception cause ["+ex.getCause()+"]");
		String errorMessage = errorMessageSource.getMessage(MandrinExceptionCode.Common.UNKNOWN, null, Locale.getDefault());
		LOG.info("Sending custome error message to view.error message["+errorMessage+"]");
		return new ErrorDTO(errorMessage);
	}

}
