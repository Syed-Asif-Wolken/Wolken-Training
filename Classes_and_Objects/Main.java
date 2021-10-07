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
		Mall mall2 = new Mall("person 2","Cotton","Shirt","Louis Vitton",1999.99f);
		System.out.println(mall2.name+" -> "+mall2.fabric+" -> "+mall2.type+" -> "+mall2.company+" -> "+mall2.price);
		mall2.shopping();
		System.out.println("================================================================================");	
	}
}