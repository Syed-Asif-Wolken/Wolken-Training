class Main{
	public static void main(String []args){
		Furniture furn = new Furniture();
		Cricket cric = new Cricket();
		Mall mall = new Mall();
		System.out.println("================================================================================");
		System.out.println(furn.type+" -> "+furn.name+" -> "+furn.price);
		furn.isSitting();
		furn.isSleeping();
		furn.type = "Bed";
		furn.name = "Person 2";
		furn.price = 7895.567f;
		System.out.println(furn.type+" -> "+furn.name+" -> "+furn.price);
		System.out.println("================================================================================");
		System.out.println(cric.player+" -> "+cric.matchesPlayed+" -> "+cric.runsScored);
		cric.print();
		cric.player = "Sachin";
		cric.matchesPlayed = 250;
		cric.runsScored = 11324;
		System.out.println(cric.player+" -> "+cric.matchesPlayed+" -> "+cric.runsScored);
		cric.print();
		System.out.println("================================================================================");		
		System.out.println(mall.name+" -> "+mall.fabric+" -> "+mall.type+" -> "+mall.company+" -> "+mall.price);
		mall.shopping();
		mall.name = "person 2";
		mall.fabric = "Cotton";
		mall.type = "Shirt";
		mall.company = "Louis Vitton";
		mall.price = 1999.99f;
		System.out.println(mall.name+" -> "+mall.fabric+" -> "+mall.type+" -> "+mall.company+" -> "+mall.price);
		mall.shopping();
		System.out.println("================================================================================");	
	}
}