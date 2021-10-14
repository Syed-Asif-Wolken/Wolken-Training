import java.util.*;
class ExcepTester{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Exceptions except = new Exceptions();
		System.out.println("Select Choice of Exception");
		System.out.println("1. StackOverflowError");
		System.out.println("2. ArrayIndexOutOfBoundsException");
		System.out.println("3. StringIndexOutOfBoundsException");
		System.out.println("4. InputMismatchException");
		System.out.println("5. NullPointerException");
		System.out.println("6. ArithmeticException");
		System.out.println("7. NumberFormatException");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				except.stackOverEx();
			break;
			case 2:
				except.arrayEx();
			break;
			case 3:
				except.stringEx();
			break;
			case 4:
				except.inputMisEx();
			break;
			case 5:
				except.NullEx();
			break;
			case 6:
				int s = except.arithEx();
				System.out.println(s);
			break;
			case 7:
				except.noFormatEx();
			break;
		}
	}
}