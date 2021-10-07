public class Furniture{
	String type = "Sofa";
	float price = 6000f;
	String name = "Person 1";
	
	Furniture(){
	}
	
	void isSitting(){
		System.out.println(name+" is sitting.");
	}
	void isSleeping(){
		System.out.println(name+" is sleeping.");
	}
}