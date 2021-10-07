public class Mall{
	String company = "Flying Machine";
	String fabric = "Cotton";
	String type = "T-Shirt";
	String name = "Person1";
	float price = 799f;
	
	Mall(){
		
	}
	
	Mall(String comp, String fab, String t, String na, float pr){
		company = comp;
		fabric = fab;
		type = t;
		name = na;
		price = pr;
	}
	
	void shopping(){
		System.out.println(name+" bought "+fabric+" based "+type+" from "+company+" for "+price);		
	}
}