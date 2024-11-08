package starcraft;

public class DropShip extends AirUnit {
	
	DropShip(){
		super("DROPSHIP", 300);
	}
	
	protected void flying() {
		System.out.println("이 유닛은 날 수 있습니다.");
	}

}
