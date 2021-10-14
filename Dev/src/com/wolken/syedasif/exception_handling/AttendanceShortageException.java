package com.wolken.syedasif.exception_handling;

public class AttendanceShortageException extends RuntimeException{
	public String getMessage() {
        return "Attendance Shortage: Student not eligible for exam";
    }
}
