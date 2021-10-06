public class Stat {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Stat.add(1, 2);
		
		Stat staticExample = new Stat();
		staticExample.multiply(1, 2);
	}

}
