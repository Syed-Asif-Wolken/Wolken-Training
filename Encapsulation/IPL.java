import java.util.*;
class IPL{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of teams: ");
		int no = sc.nextInt();
		IPLTeams []teams = new IPLTeams[no];
		int count=0;
		while(true){
			System.out.println("Enter Your Choice: ");
			System.out.println("1. Insert ");
			System.out.println("2. Display ");
			System.out.println("Press any other number to exit.");
			int n = sc.nextInt();
			if(n==1){
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
					count++;
			}
			else if(n==2){
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
			else{
				break;
			}
		}
	}
}