import java.util.*;
class Country{
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int count=0;
	void insert(CountryDetails []countries){
		for(int i=0;i<n;i++){
			sc.nextLine();
			CountryDetails country = new CountryDetails();
			System.out.println("Enter Country: ");
			String name = sc.nextLine();
			System.out.println("Enter Capital: ");
			String cap = sc.nextLine();
			System.out.println("Enter no of States: ");
			byte states = sc.nextByte();
			System.out.println("Enter Population in Cr: ");
			short pop = sc.nextShort();
			
			country.setCountry(name);
			country.setCapital(cap);
			country.setNoOfStates(states);
			country.setPopulation(pop);
			countries[i] = country;
			count++;
		}
	}
	
	void display(CountryDetails []countries){
		System.out.println("================================================");
		for(int i=0;i<n;i++){
			CountryDetails country= new CountryDetails();
			country = countries[i];
			String name = country.getCountry();
			String cap = country.getCapital();
			byte states = country.getNoOfStates();
			short pop = country.getPopulation();
			
			System.out.println("Country: "+name+"\nCapital: "+cap+"\nNo. of States: "+states+"\nPopulation: "+pop+" Cr.");
			System.out.println("================================================");
		}
	}
	
	void update(CountryDetails []countries,String ucountry){
		for(int i=0;i<n;i++){
			CountryDetails country= new CountryDetails();
			country = countries[i];
			String name = country.getCountry();
			if(name.equals(ucountry)){
				System.out.println("Enter Country: ");
				name = sc.nextLine();
				System.out.println("Enter Capital: ");
				String cap = sc.nextLine();
				System.out.println("Enter no of States: ");
				byte states = sc.nextByte();
				System.out.println("Enter Population in Cr: ");
				short pop = sc.nextShort();
				
				country.setCountry(name);
				country.setCapital(cap);
				country.setNoOfStates(states);
				country.setPopulation(pop);
				countries[i] = country;
			}
			else{
				System.out.println("Country does not exist");
			}
		}
	}
	
	public static void main(String []args){
		int choice;
		Country obj = new Country();
		System.out.println("Enter the number of countries: ");
		n = sc.nextInt();
		CountryDetails []countries = new CountryDetails[n];
		do{
			System.out.println("Enter Your Choice: ");
			System.out.println("1. Insert ");
			System.out.println("2. Display ");
			System.out.println("3. Update ");
			System.out.println("Press 4 to exit.");
			choice = sc.nextInt();
			
			if(choice == 1){
				if(count<n)
					obj.insert(countries);
				else
					System.out.println(n+" countries have been entered.");
			}
			else if(choice == 2){
				obj.display(countries);
			}
			else if(choice == 3){
				sc.nextLine();
				System.out.println("Enter Country to update: ");
				String ucountry = sc.nextLine();
				obj.update(countries, ucountry);
			}
		}while(choice!=4);
	}
}