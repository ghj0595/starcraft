package starcraft;

public class StarcraftGame {
	
	private StarcraftGame() {
		
	}
	
	private static StarcraftGame instance = new StarcraftGame();
	
	public static StarcraftGame getInstance() {
		return instance;
	}
	
	public void run() {
		setUnit();
	}
	
	private void setUnit() {
		Tank tank = new Tank();
		Scv scv = new Scv();
	}

}
