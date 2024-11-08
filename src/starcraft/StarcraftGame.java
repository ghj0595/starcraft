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
	private DropShip dropShip = new DropShip();
	
	public void run() {
		printUnit();
	}
	
	private void printUnit() {
		System.out.println(tank);
		System.out.println(marine);
		System.out.println(scv);
		System.out.println(dropShip);
	}

}
