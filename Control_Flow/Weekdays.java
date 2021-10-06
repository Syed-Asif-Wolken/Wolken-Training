import java.util.Scanner;
public class Weekdays{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		/* if(n==1)
		System.out.println("Sunday");
		if(n==2)
		System.out.println("Monday");
		if(n==3)
		System.out.println("Tuesday");
		if(n==4)
		System.out.println("Wednesday");
		if(n==5)
		System.out.println("Thursday");
		if(n==6)
		System.out.println("Friday");
		if(n==7)
		System.out.println("Saturday");
		if(n>7||n<1)
		System.out.println("Please Enter a valid number"); */
		
		if(n==1)
		System.out.println("Sunday");
		else if(n==2)
		System.out.println("Monday");
		else if(n==3)
		System.out.println("Tuesday");
		else if(n==4)
		System.out.println("Wednesday");
		else if(n==5)
		System.out.println("Thursday");
		else if(n==6)
		System.out.println("Friday");
		else if(n==7)
		System.out.println("Saturday");
		else
		System.out.println("Please Enter a valid number"); 
		
	}
}