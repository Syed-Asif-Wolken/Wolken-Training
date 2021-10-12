import java.util.*;
class Tester{
	static Scanner sc = new Scanner(System.in);
	static Scientist []st = new Scientist[20];
	int count=0;
	
	boolean save(Scientist scientist){
		if(count<st.length){
			st[count] = scientist;
			count++;
			return true;
		}
		else{
			return false;
		}
	}
	
	void get(Scientist scientist){
		String name = scientist.getName();
		byte yrsOfExp = scientist.getYrsOfExp();
		String role = scientist.getRole();
		String type = scientist.getType();
		Addresses address = scientist.getAddress();
		short houseNo = address.getHouseNo();
		String area = address.getArea();
		String city = address.getCity();
		String state = address.getState();
		String country = address.getCountry();
		int pincode = address.getPincode();
		System.out.println(name+"\n"+yrsOfExp+"\n"+role+"\n"+type+"\n"+houseNo+"\n"+area+"\n"+city+"\n"+state+"\n"+country+"\n"+pincode);
	}
	void getAll(){
		Scientist scientist = new Scientist();
		Tester test = new Tester();
		System.out.println("==============================================");
		for(int i=0;i<count;i++){
			scientist = st[i];
			test.get(scientist);
			System.out.println("==============================================");
		}
	}
	
	Scientist getOne(String name){
		Scientist scientist = new Scientist();
		System.out.println("==============================================");
		for(int i=0;i<count;i++){
			String sname = st[i].getName();
			if(sname.equals(name)){
				return st[i];
			}
		}
		return null;
	}
	
	boolean updateRoleByName(String role, String name){
		Scientist scientist = new Scientist();
		for(int i=0;i<count;i++){
			String sname = st[i].getName();
			if(sname.equals(name)){
				st[i].setRole(role);
				return true;
			}
		}
		return false;
	}
	
	boolean deleteByName(String name){
		Scientist scientist = new Scientist();
		for(int i=0;i<count;i++){
			String sname = st[i].getName();
			if(sname.equals(name)){
				st[i].setRole("");
				st[i].setName("");
				st[i].setYrsOfExp((byte)0);
				st[i].setType("");
				st[i].deleteAddress();
				return true;
			}
		}
		return false;
	}
	
	public static void main(String []args){
		Tester test = new Tester();
		while(true){
			System.out.println("Enter Your Choice");
			System.out.println("1.Insert");
			System.out.println("2.Display All");
			System.out.println("3.Display One");
			System.out.println("4.Update");
			System.out.println("5.Delete");
			System.out.println("Enter any other number to exit.");
			int choice = sc.nextInt();
			
			if(choice == 1){
				sc.nextLine();
				Scientist scientist = new Scientist();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Years of Experience: ");
				byte yrsOfExp = sc.nextByte();
				sc.nextLine();
				System.out.println("Enter Role: ");
				String role = sc.nextLine();
				System.out.println("Enter Type: ");
				String type = sc.nextLine();
				scientist.setName(name);
				scientist.setYrsOfExp(yrsOfExp);
				scientist.setRole(role);
				scientist.setType(type);
				scientist.setAddress();
				boolean flag = test.save(scientist);
				if(flag){
					System.out.println("Data Entered Successfully");
				}
				else{
					System.out.println("Data not saved");
				}
			}
			
			else if(choice == 2){
				test.getAll();
			}
			
			else if(choice == 3){
				sc.nextLine();
				System.out.println("Enter name to display details: ");
				String name = sc.nextLine();
				Scientist science = test.getOne(name);
				test.get(science);
				System.out.println("==============================================");
			}
			
			else if(choice == 4){
				sc.nextLine();
				System.out.println("Enter name to update: ");
				String name = sc.nextLine();
				System.out.println("Enter Role to edit: ");
				String role = sc.nextLine();
				boolean flag = test.updateRoleByName(role, name);
				if(flag){
					System.out.println("Updated Successfully");
				}
				else{
					System.out.println("Update Failed");
				}
			}
			
			else if(choice == 5){
				sc.nextLine();
				System.out.println("Enter name to delete data: ");
				String name = sc.nextLine();
				boolean flag = test.deleteByName(name);
				if(flag){
					System.out.println("Deleted Successfully");
				}
				else{
					System.out.println("Delete Failed");
				}
			}
			
			else{
				break;
			}
		}
	}
}