
public class TeamStatistics extends Statistics {

	String teamName;
	
	public TeamStatistics(int id, String teamName) {
		super(id);
		this.teamName = teamName;
		
	}

	@Override
	public void onGoalScored() {
		System.out.println("ONE GOAL IS ADDED TO "+teamName+"'s STATISTICS!!!");
	}

}
