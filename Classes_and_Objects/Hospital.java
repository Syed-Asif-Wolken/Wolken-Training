class Hospital{
	public static void main(String[] args){
		HospitalDetails PG = new HospitalDetails();
		System.out.println("================================================================================");
		boolean admission = PG.admission();
		admission = PG.admission(1,"Person 1",9656678567l,"Address Line 1","Person1@email.com","website1.com","Male");
		if (admission){
			PG.display();
		}
		System.out.println("================================================================================");
		String[] foods = PG.food();
		System.out.println("Food Items: ");
		for(String food: foods){
			System.out.print(food+"  ");
		}
		System.out.println();
		System.out.println("================================================================================");
		boolean vac = PG.vacancy(3);
		if (vac)
			System.out.println("Vacancy Exists");
		else
			System.out.println("No Vacancies");
		vac = PG.vacancy(8);
		if (vac)
			System.out.println("Vacancy Exists");
		else
		System.out.println("No Vacancies");
		System.out.println("================================================================================");
	}
}