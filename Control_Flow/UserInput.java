import java.util.Scanner;
public class UserInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the following details: \n1. Byte\n2. Short\n3. Int\n4. Long\n5. Float\n6. Double\n7. Boolean\n8. Char\n9. String\n");
		
		byte in1 = sc.nextByte();
		short in2 = sc.nextShort();
		int in3 = sc.nextInt();
		long in4 = sc.nextLong();
		float in5 = sc.nextFloat();
		double in6 = sc.nextDouble();
		boolean in7 = sc.nextBoolean();
		char in8 = sc.next().charAt(0);
		sc.nextLine();
		String in9 = sc.nextLine();
		System.out.println("=======================");
		System.out.println(in1+"\n"+in2+"\n"+in3+"\n"+in4+"\n"+in5+"\n"+in6+"\n"+in7+""+"\n"+in8+"\n"+in9);
	}
}