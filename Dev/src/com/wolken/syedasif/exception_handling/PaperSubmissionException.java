package com.wolken.syedasif.exception_handling;

public class PaperSubmissionException extends RuntimeException {
	public String getMessage() {
        return "Student can't exit exam";
    }
}
