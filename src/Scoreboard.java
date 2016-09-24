import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

	List<ScoreObserver> scoreObservers = new ArrayList<ScoreObserver>();
	
    public void addObserver(ScoreObserver observer){
    	scoreObservers.add(observer);
    }
    
    public void goalScored(int playerId, int teamId){
    	for(ScoreObserver observer : scoreObservers){
    		notifyDesiredObserver(playerId, teamId, observer);
    	}
    }

	private void notifyDesiredObserver(int playerId, int teamId, ScoreObserver observer) {
		if(isPlayerStatistics(observer)){
			if(isPlayeridMatchedWithObserverId(playerId, observer)){
				observer.onGoalScored();	
			}
		}
		
		if(isTeamStatistics(observer)){
			if(isTeamIdMatchedWithObserverId(teamId, observer)){
				observer.onGoalScored();
			}
		}
	}

	private boolean isTeamIdMatchedWithObserverId(int teamId, ScoreObserver observer) {
		return ((TeamStatistics)observer).getId() == teamId;
	}

	private boolean isTeamStatistics(ScoreObserver observer) {
		return observer instanceof TeamStatistics;
	}

	private boolean isPlayeridMatchedWithObserverId(int playerId, ScoreObserver observer) {
		return ((PlayerStatistics)observer).getId() == playerId;
	}

	private boolean isPlayerStatistics(ScoreObserver observer) {
		return observer instanceof PlayerStatistics;
	}
}
