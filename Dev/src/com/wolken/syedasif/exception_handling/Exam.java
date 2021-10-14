package com.wolken.syedasif.exception_handling;
import java.util.*;
public class Exam {
	
	String validateAge(boolean flag){
		 if (flag) {
	            try {
	                throw new InvalidAgeException();
	            } catch (InvalidAgeException e) {
	                return e.getMessage();
	            }
	        } else return "Valid for Exam";
	    }
	
	String mobileFound(boolean flag) {
        if (flag) {
            try {
                throw new MobileFoundException();
            } catch (MobileFoundException e) {
                return e.getMessage();
            }
        } else return "Valid for Exam";
    }

    String cheating(boolean flag) {
        if (flag) {
            try {
                throw new CheatingException();
            } catch (CheatingException e) {
                return e.getMessage();
            }
        } else return "Valid for Exam";
    }

    String attendanceShortage(boolean flag) {
        if (flag) {
            try {
                throw new AttendanceShortageException();
            } catch (AttendanceShortageException e) {
                return e.getMessage();
            }
        } else return "Valid for Exam";
    }

    String invalidHallTicket(boolean flag) {
        if (flag) {
            try {
                throw new InvalidHallTicketException();
            } catch (InvalidHallTicketException e) {
                return e.getMessage();
            }
        } else return "Valid for Exam";
    }

String paperSub(boolean flag) {
	 if (flag) {
         try {
             throw new PaperSubmissionException();
         } catch (PaperSubmissionException e) {
             return e.getMessage();
         }
     } else return "Student can leave";
}

String result(boolean flag) {
	 if (flag) {
        try {
            throw new ResultException();
        } catch (ResultException e) {
            return e.getMessage();
        }
    } else return "Student has passed";
}

String idCheck(boolean flag) {
	 if (flag) {
	        try {
	            throw new IdCardException();
	        } catch (IdCardException e) {
	            return e.getMessage();
	        }
	    } else return "Valid ID Card";
}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Exam exam = new Exam();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		if(age>45 || age<17)
			System.err.println(exam.validateAge(true));
		else
			System.out.println(exam.validateAge(false));
		System.out.println("Does Student carry mobile: Y or N");
		String mob = sc.nextLine();
		if(mob.equals("Y"))
			System.err.println(exam.mobileFound(true));
		else
			System.out.println(exam.mobileFound(false));
		System.out.println("Does Student have Attendance Shortage: Y or N");
		String att = sc.nextLine();
		if(att.equals("Y"))
			System.err.println(exam.attendanceShortage(true));
		else
			System.out.println(exam.attendanceShortage(false));
		System.out.println("Does Student have Hall Ticket: Y or N");
		String ht = sc.nextLine();
		if(ht.equals("N"))
			System.err.println(exam.invalidHallTicket(true));
		else
			System.out.println(exam.invalidHallTicket(false));
		System.out.println("Does Student have ID Card: Y or N");
		String id = sc.nextLine();
		if(id.equals("N"))
			System.err.println(exam.idCheck(true));
		else
			System.out.println(exam.idCheck(false));
		System.out.println("Did Student cheat: Y or N");
		String cheat = sc.nextLine();
		if(cheat.equals("Y"))
			System.err.println(exam.cheating(true));
		else
			System.out.println(exam.cheating(false));
		System.out.println("Did Student submit paper: Y or N");
		String sub = sc.nextLine();
		if(sub.equals("N"))
			System.err.println(exam.paperSub(true));
		else
			System.out.println(exam.paperSub(false));
		System.out.println("Student Result: Y or N");
		String res = sc.nextLine();
		if(res.equals("N"))
			System.err.println(exam.result(true));
		else
			System.out.println(exam.result(false));
	}
}
