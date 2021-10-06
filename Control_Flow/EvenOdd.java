import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrray");
		int n = sc.nextInt();
		int[] input = new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++){
			input[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(input[i]%2==0)
			System.out.println(input[i]+" : Even");
			else
			System.out.println(input[i]+" : Odd");
		}
		
	}
}