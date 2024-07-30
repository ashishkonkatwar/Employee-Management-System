package com.project.emp_mngnt_sys.exceptionhandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandling {
	
	String error;
	
	@ExceptionHandler
	public void Exception() throws valueNotFoundException {
		ErrorHandling(String error){
			super(error);
		}
	
}

	private void ErrorHandling(String error2) {
		// TODO Auto-generated method stub
		
	}
	

}
