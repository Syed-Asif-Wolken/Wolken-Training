import java.util.*;
class Exceptions{
	Scanner sc = new Scanner(System.in);
	int stackOverEx(){
		return stackOverEx();
	}
	
	int arrayEx(){
		int []arr = {1,2,3,4,5};
		return arr[23];
	}
	
	int stringEx(){
		String ele = "Words";
		return ele.charAt(25);
	}
	
	void inputMisEx(){
		System.out.println("Enter a string:");
		int str = sc.nextInt();
		System.out.println(str);
	}
	
	void NullEx(){
		String str=null;
		if(str.equals("word")){
			System.out.println("Null");
		}
	}
	
	int arithEx(){
		int a=5,b=0;
		return a/b;
	}
	
	void noFormatEx(){
		System.out.println(Integer.parseInt("null"));
	}
}