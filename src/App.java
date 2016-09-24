
public class App {

	public static void main(String[] args) {
		Scoreboard scoreboard = new Scoreboard();
		PlayerStatistics messiStatistics = new PlayerStatistics(19, "Messi");
		TeamStatistics bercelonaStatistics = new TeamStatistics(7, "Bercelona");
		PlayerStatistics NeymarStatistics = new PlayerStatistics(11, "Neymar jr");
		
		scoreboard.addObserver(messiStatistics);
		scoreboard.addObserver(bercelonaStatistics);
		scoreboard.addObserver(NeymarStatistics);
		
		scoreboard.goalScored(19, 7);
		scoreboard.goalScored(11, 7);
	}
}
