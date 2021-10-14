package com.wolken.syedasif.exception_handling;

public class ResultException extends RuntimeException{
	public String getMessage() {
		return "Student has failed";
	}
}
