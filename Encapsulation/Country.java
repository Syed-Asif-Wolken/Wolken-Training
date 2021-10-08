import java.util.*;
class Country{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		CountryDetails []countries = new CountryDetails[n];
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
		}
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
}