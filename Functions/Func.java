public class Func{
	public static void main(String[] args){
		FuncCall s = new FuncCall();
		System.out.println("=======================================================");
		s.display();
		System.out.println("=======================================================");
		s.display("This is Java");
		System.out.println("=======================================================");
		s.display("Java was developed by James Gosling in ",1995);
		System.out.println("=======================================================");
		s.display("Testing",1,2,3,4,5);
		System.out.println("=======================================================");
	}
}