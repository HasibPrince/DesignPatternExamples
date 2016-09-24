
public class PlayerStatistics extends Statistics {

	String playerName;
	
	public PlayerStatistics(int id,String playerName) {
		super(id);
		this.playerName = playerName;
	}

	@Override
	public void onGoalScored() {
		System.out.println("ONE GOAL IS ADDED TO "+playerName+"'s STATISTICS!!!");
	}

}
