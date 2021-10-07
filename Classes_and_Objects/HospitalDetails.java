public class HospitalDetails{
	int id;
	String name;
	long contactNumber;
	String address;
	String emailId;
	String website;
	String gender;
	
	boolean admission(){
		System.out.println("Details Not Entered");
		return false;
	}
	
	boolean admission(int id, String name, long contactNumber, String address, String emailId, String website, String gender){
		this.id=id;
		this.name=name;
		this.contactNumber=contactNumber;
		this.address=address;
		this.emailId=emailId;
		this.website=website;
		this.gender=gender;
		System.out.println("Details Entered");
		return true;
	}
	
	void display(){
		System.out.println("ID: "+id+"\nName: "+name+"\nContact Number: "+contactNumber+"\nAddress: "+address+"\nEmail Id: "+emailId+"\nWebsite: "+website+"\nGender: "+gender);
	}
	
	String[] food(){
		String[] foodItems = {"Aloo Gobi","Butter Chicken","Chana Masala","palak Paneer","Chicken Tikka Masala","Naan","Fish Curry","Tandoori Roti"};
		return foodItems;
	}
	
	boolean vacancy(int n){
		int vacancy = 5;
		if(n>vacancy || vacancy==0)
			return false;
		return true;
	}
}