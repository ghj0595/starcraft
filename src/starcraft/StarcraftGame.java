package starcraft;

import java.util.Scanner;

public class StarcraftGame {
	
	private StarcraftGame() {
		
	}
	
	private static StarcraftGame instance = new StarcraftGame();
	
	public static StarcraftGame getInstance() {
		return instance;
	}
	
	private Scanner scanner = new Scanner(System.in);
	
	private Tank tank = new Tank();
	private Scv scv = new Scv();
	private Marine marine = new Marine();
	private DropShip dropship = new DropShip();
	
	public void run() {
		
	}
	
	private void printUnit() {
		
	}

}
