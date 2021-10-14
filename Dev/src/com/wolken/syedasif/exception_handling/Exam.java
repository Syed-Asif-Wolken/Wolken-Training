package com.wolken.syedasif.exception_handling;
import java.util.*;
public class Exam {
	
	void validateAge(int age) throws InvalidAgeException{
		if(age>45) {
			throw new InvalidAgeException("Not Valid for Exam");
		}
		else {
			System.out.println("Valid for Exam");
		}
	}
	
	String mobileFound(boolean b) {
        if (b) {
            try {
                throw new MobileFoundException();
            } catch (MobileFoundException mobileFoundException) {
                return mobileFoundException.getMessage();
            }
        } else return "Valid for Exam";
    }

    String cheating(boolean b) {
        if (b) {
            try {
                throw new CheatingException();
            } catch (CheatingException cheatingException) {
                return cheatingException.getMessage();
            }
        } else return "Valid for Exam";
    }

    String attendanceShortage(boolean b) {
        if (b) {
            try {
                throw new AttendanceShortageException();
            } catch (AttendanceShortageException attendanceShortageException) {
                return attendanceShortageException.getMessage();
            }
        } else return "Valid for Exam";
    }

    String noHallTicket(boolean b) {
        if (b) {
            try {
                throw new NoHallTicketException();
            } catch (NoHallTicketException noHallTicketException) {
                return noHallTicketException.getMessage();
            }
        } else return "Valid for Exam";
    }

    String smartWatchFound(boolean b) {
        if (b) {
            try {
                throw new SmartWatchFoundException();
            } catch (SmartWatchFoundException smartWatchFoundException) {
                return smartWatchFoundException.getMessage();
            }
        } else return "Valid for Exam";
    }

    String comingLate(boolean b) {
        if (b) {
            try {
                throw new ComingLateException();
            } catch (ComingLateException comingLateException) {
                return comingLateException.getMessage();
            }
        } else return "Valid for Exam";
    }
	
	public static void main(String args[]) {
		Exam exam = new Exam();
		try {
		System.out.println("Enter Age");
		exam.validateAge(98);
		}
		catch(InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
	}
}
