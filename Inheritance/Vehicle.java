class Vehicle extends AutoMobiles{
	String company;
	byte noOfWheels;
	
	void getAutoMobiles(){
		super.getAutoMobiles();
		System.out.println("Add-On");
	}
	
	void getVehicle(){
		System.out.println("This is the child - Vehicle Class");
	}
}