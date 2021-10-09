import java.util.*;
class IPL{
	static Scanner sc = new Scanner(System.in);
	void insert(IPLTeams []teams,int count){
		sc.nextLine();
		IPLTeams team = new IPLTeams();
		System.out.println("Enter Team: ");
		String name = sc.nextLine();
		System.out.println("Enter Captain: ");
		String cap = sc.nextLine();
		System.out.println("Enter Sponsor: ");
		String sponsor = sc.nextLine();
		System.out.println("Enter MVP: ");
		String mvp = sc.nextLine();
		System.out.println("Enter Points: ");
		short points = sc.nextShort();
		
		team.setTeam(name);
		team.setCaptain(cap);
		team.setSponsor(sponsor);
		team.setMVP(mvp);
		team.setPoints(points);
		teams[count] = team;
	}
	
	void get(IPLTeams []teams,int count){
		System.out.println("================================================");
		for(int i=0;i<count;i++){
			IPLTeams team = new IPLTeams();
			team = teams[i];
			String name = team.getTeam();
			String cap = team.getCaptain();
			String sponsor = team.getSponsor();
			String mvp = team.getMVP();
			short points = team.getPoints();
			
			System.out.println("Team: "+name+"\nCaptain: "+cap+"\nSponsor: "+sponsor+"\nMVP: "+mvp+"\nPoints: "+points);
			System.out.println("================================================");
		}
	}
	
	void update(IPLTeams []teams,int count,String uteam){
		for(int i=0;i<count;i++){
			IPLTeams team = new IPLTeams();
			team = teams[i];
			String name = team.getTeam();
			if(name.equals(uteam)){
				System.out.println("Enter Team: ");
				name = sc.nextLine();
				System.out.println("Enter Captain: ");
				String cap = sc.nextLine();
				System.out.println("Enter Sponsor: ");
				String sponsor = sc.nextLine();
				System.out.println("Enter MVP: ");
				String mvp = sc.nextLine();
				System.out.println("Enter Points: ");
				short points = sc.nextShort();
				
				team.setTeam(name);
				team.setCaptain(cap);
				team.setSponsor(sponsor);
				team.setMVP(mvp);
				team.setPoints(points);
				teams[i] = team;
			}
			else{
				System.out.println("Team does not exist");
			}
		}
	}
	
	public static void main(String []args){
		IPL obj = new IPL();
		// Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of teams: ");
		int no = sc.nextInt();
		IPLTeams []teams = new IPLTeams[no];
		int count=0;
		while(true){
			System.out.println("Enter Your Choice: ");
			System.out.println("1. Insert ");
			System.out.println("2. Display ");
			System.out.println("3. Update ");
			System.out.println("Press any other number to exit.");
			int n = sc.nextInt();
			if(n==1){
				if(count<no){
					obj.insert(teams,count);	
					count++;
				}
				else{
					System.out.println(no+" Teams have been entered");
				}
			}
			else if(n==2){
				obj.get(teams,count);
			}
			else if(n==3){
				sc.nextLine();
				System.out.println("Enter team name to update");
				String uteam = sc.nextLine();
				obj.update(teams,count,uteam);
			}
			else{
				break;
			}
		}
	}
}