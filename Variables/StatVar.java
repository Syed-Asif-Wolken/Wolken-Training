
public class StatVar {
	public String normalVariable = null;
	public static String staticVariable = null;
	public static void main(String[] args) {
		StatVar firstExample = new StatVar();
		firstExample.normalVariable = "Hello";
		firstExample.staticVariable = "Hello";
		StatVar secondExample = new StatVar();
		System.out.println("normalVariable: "+ secondExample.normalVariable);
		System.out.println("staticVariable: "+ secondExample.staticVariable);
	}
}