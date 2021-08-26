package com.assessment.topnationcommandassessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="StateCommand is null in the input request")
public class StateCommandNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
}
