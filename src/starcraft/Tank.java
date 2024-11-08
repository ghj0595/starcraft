package starcraft;

public class Tank extends GroundUnit implements Repairable {
	private int power;
	
	public Tank(){
		super("TANK", 250);
		this.power = 50;
	}
	
	public void Attackable(Unit unit) {
		unit.hp -= this.power;
	}
}
