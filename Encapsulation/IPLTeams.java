public class IPLTeams{
	private String team;
	private String captain;
	private String sponsor;
	private String mvp;
	private short points;
	
	void setTeam(String team){
		this.team = team;
	}
	
	String getTeam(){
		return team;
	}
	
	void setCaptain(String captain){
		this.captain = captain;
	}
	String getCaptain(){
		return captain;
	}
	
	void setSponsor(String sponsor){
		this.sponsor = sponsor;
	}
	String getSponsor(){
		return sponsor;
	}
	
	void setMVP(String mvp){
		this.mvp = mvp;
	}
	String getMVP(){
		return mvp;
	}
	
	void setPoints(short points){
		this.points = points;
	}
	short getPoints(){
		return points;
	}
}