public class FuncCall{
	public void display(){
		System.out.println("Hello World");
	}
	public void display(String word){
		System.out.println(word);
	}
	public void display(String word, int number){
		System.out.println(word+" "+number);
	}
	public void display(String word,int ...numbers){
		System.out.println(word);
		for(int i: numbers){
			System.out.println(i);
		}
	}
}