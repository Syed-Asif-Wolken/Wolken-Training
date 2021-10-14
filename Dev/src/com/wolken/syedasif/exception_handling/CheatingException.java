package com.wolken.syedasif.exception_handling;

public class CheatingException extends Exception{
	public String getMessage() {
        return "Cheating is not allowed in the exam hall";
    }
}
