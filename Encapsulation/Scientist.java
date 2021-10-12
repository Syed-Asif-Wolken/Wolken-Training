import java.util.*;
public class Scientist{
	static Scanner sc = new Scanner(System.in);
	private String name;
	private byte yrsOfExp;
	private String role;
	private String type;
	private Addresses address = new Addresses();
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setYrsOfExp(byte yrsOfExp){
		this.yrsOfExp = yrsOfExp;
	}
	
	byte getYrsOfExp(){
		return yrsOfExp;
	}
	
	void setRole(String role){
		this.role = role;
	}
	
	String getRole(){
		return role;
	}
	
	void setType(String type){
		this.type = type;
	}
	
	String getType(){
		return type;
	}
	
	void setAddress(){
		System.out.println("Enter Address: ");
		System.out.println("Enter House No: ");
		short houseNo = sc.nextShort();
		sc.nextLine();
		System.out.println("Enter Area: ");
		String area = sc.nextLine();
		System.out.println("Enter City: ");
		String city = sc.nextLine();
		System.out.println("Enter State: ");
		String state = sc.nextLine();
		System.out.println("Enter Country: ");
		String country = sc.nextLine();
		System.out.println("Enter Pincode: ");
		int pincode = sc.nextInt();
		sc.nextLine();
		address.setHouseNo(houseNo);
		address.setArea(area);
		address.setCity(city);
		address.setState(state);
		address.setCountry(country);
		address.setPincode(pincode);
	}
	
	void deleteAddress(){
		address.setHouseNo((short)0);
		address.setArea("");
		address.setCity("");
		address.setState("");
		address.setCountry("");
		address.setPincode(0);
	}
	
	void setAddress(Addresses address){
		this.address = address;
	}
	
	Addresses getAddress(){
		return address;
	}
}