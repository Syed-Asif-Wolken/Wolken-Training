public class CountryDetails{
	private String country;
	private String capital;
	private short population;
	private byte noOfStates;
	
	void setCountry(String country){
		this.country = country;
	}
	String getCountry(){
		return country;
	}
	
	void setCapital(String capital){
		this.capital = capital;
	}
	String getCapital(){
		return capital;
	}
	
	void setPopulation(short population){
		this.population = population;
	}
	short getPopulation(){
		return population;
	}
	
	void setNoOfStates(byte noOfStates){
		this.noOfStates = noOfStates;
	}
	byte getNoOfStates(){
		return noOfStates;
	}
	
}