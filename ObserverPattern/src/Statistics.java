
public abstract class Statistics implements ScoreObserver{
	int id;
	
	public Statistics(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
