public class WolkenEmp{
	int id;
	String name;
	String emailId;
	long contactNo;
	
	WolkenEmp(){
		
	}
	WolkenEmp(int id){
		this();
		this.id = id;
	}
	WolkenEmp(String name){
		this.name = name;
	}
	WolkenEmp(long contactNo){
		
		this.contactNo = contactNo;
	}
	WolkenEmp(int id, String name, String emailId, long contactNo){
		this(id);
		this.name=name;
		this.contactNo=contactNo;
		this.emailId = emailId;
	}
}