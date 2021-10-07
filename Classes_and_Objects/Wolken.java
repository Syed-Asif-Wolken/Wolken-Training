class Wolken{
	public static void main(String[] args){
		WolkenEmp emp1 = new WolkenEmp();
		System.out.println(emp1.id+" "+emp1.name+" "+emp1.emailId+" "+emp1.contactNo);
		WolkenEmp emp2 = new WolkenEmp(1);
		System.out.println(emp2.id+" "+emp2.name+" "+emp2.emailId+" "+emp2.contactNo);
		WolkenEmp emp3 = new WolkenEmp("Person 1");
		System.out.println(emp3.id+" "+emp3.name+" "+emp3.emailId+" "+emp3.contactNo);
		WolkenEmp emp4 = new WolkenEmp(9845978887l);
		System.out.println(emp4.id+" "+emp4.name+" "+emp4.emailId+" "+emp4.contactNo);
		WolkenEmp emp5 = new WolkenEmp(2,"Person 2","person2@email.com",9789787698l);
		System.out.println(emp5.id+" "+emp5.name+" "+emp5.emailId+" "+emp5.contactNo);
	}
}