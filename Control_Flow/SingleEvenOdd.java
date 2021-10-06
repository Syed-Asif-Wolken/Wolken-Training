import java.util.Scanner;
public class SingleEvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("Enter a number:");
			input = sc.nextInt();
			if(input%2==0)
			System.out.println(input+" is Even");
			else
			System.out.println(input+" is Odd");
	}
}