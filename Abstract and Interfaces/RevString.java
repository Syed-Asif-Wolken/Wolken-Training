import java.util.*;
class RevString{
	String rev(String str){
		char[] rever = str.toCharArray();
		String reversed = "";
		for(int i=rever.length-1;i>=0;i--){
			reversed += rever[i];
		}
		return reversed;
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		RevString revs = new RevString();
		String out = revs.rev(str);
		System.out.println(out);
	}
}