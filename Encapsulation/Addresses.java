public class Addresses{
	private short houseNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pincode;
	
	void setHouseNo(short houseNo){
		this.houseNo = houseNo;
	}
	
	short getHouseNo(){
		return houseNo;
	}
	
	void setArea(String area){
		this.area = area;
	}
	
	String getArea(){
		return area;
	}
	
	void setCity(String city){
		this.city = city;
	}
	
	String getCity(){
		return city;
	}
	
	void setState(String state){
		this.state = state;
	}
	
	String getState(){
		return state;
	}
	
	void setCountry(String country){
		this.country = country;
	}
	
	String getCountry(){
		return country;
	}
	
	void setPincode(int pincode){
		this.pincode = pincode;
	}
	
	int getPincode(){
		return pincode;
	}
}