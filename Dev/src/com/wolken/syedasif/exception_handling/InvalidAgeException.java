package com.wolken.syedasif.exception_handling;

public class InvalidAgeException extends Exception { 
	public String getMessage() {
        return "Not Valid for exam.";
    }
}  
