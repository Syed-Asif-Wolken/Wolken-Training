import java.util.*;
class Pat{
	
	void pattern(int rows){
		for(int i=rows;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int n = sc.nextInt();
		Pat pat = new Pat();
		pat.pattern(n);
	}
}