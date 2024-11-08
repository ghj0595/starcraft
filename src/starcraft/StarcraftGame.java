package starcraft;

import java.util.ArrayList;
import java.util.Scanner;

public class StarcraftGame {

	private StarcraftGame() {

	}

	private final int SCV = 1;
	private final int MARINE = 2;
	private final int TANK = 3;
	private final int DROPSHIP = 4;

	private final int PRODUCE = 1;
	private final int REPAIR = 2;
	private final int EXIT = 0;

	private static StarcraftGame instance = new StarcraftGame();

	public static StarcraftGame getInstance() {
		return instance;
	}

	private Scanner scanner = new Scanner(System.in);

	private ArrayList<Tank> tanks = new ArrayList<>();
	private ArrayList<Scv> scvs = new ArrayList<>();
	private ArrayList<Marine> marines = new ArrayList<>();
	private ArrayList<DropShip> dropShips = new ArrayList<>();

	private boolean isRun = true;

	public void run() {
		while (isRun) {
			printMenu();
			play();
		}
	}

	private void play() {
		int sel = input("메뉴 선택");
		
		if(sel < EXIT || sel > REPAIR) {
			System.out.println("메뉴 번호를 다시 확인해주세요.");
			return;
		}

		if (sel == PRODUCE) {
			produceUnit();
		} else if (sel == REPAIR) {
			repair();
		} else if (sel == EXIT) {
			isRun = false;
			System.out.println("시스템이 종료됩니다.");
		}
	}

	private void produceUnit() {
		printUnitMenu();
		int sel = input("번호 선택");
		
		if(sel < SCV || sel > DROPSHIP) {
			System.out.println("번호를 다시 확인해주세요.");
			return;
		}

		if (sel == SCV) {
			produceScv();
		} else if (sel == MARINE) {
			produceMarine();
		} else if (sel == TANK) {
			produceTank();
		} else if (sel == DROPSHIP) {
			dropShip();
		}
	}

	private void produceScv() {
		Scv scv = new Scv();
		scvs.add(scv);
	}
	
	private void produceMarine() {
		Marine marine = new Marine();
		marines.add(marine);
	}
	
	private void produceTank() {
		Tank tank = new Tank();
		tanks.add(tank);
	}
	
	private void dropShip() {
		DropShip dropShip = new DropShip();
		dropShips.add(dropShip);
	}

	private void printMenu() {
		System.out.println("1.유닛생산");
		System.out.println("2.유닛수리");
		System.out.println("0.종료");
	}

	private void printUnitMenu() {
		System.out.println("1.SCV");
		System.out.println("2.MARINE");
		System.out.println("3.TANK");
		System.out.println("4.DROPSHIP");

	}

	private void repair() {

	}
	


	private int input(String message) {
		System.out.println(message + " : ");
		String input = scanner.nextLine();
		int sel = -1;
		try {
			sel = Integer.parseInt(input);
			return sel;
		} catch (Exception e) {
			System.err.println("숫자를 입력해주세요.");
		}
		return sel;
	}

}
