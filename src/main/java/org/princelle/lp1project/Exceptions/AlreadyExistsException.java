package org.princelle.lp1project.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class AlreadyExistsException extends Exception{

	private static final long serialVersionUID = 1L;

	public AlreadyExistsException(String message){
		super(message);
	}
}