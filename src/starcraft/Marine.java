package starcraft;

public class Marine extends GroundUnit {
	private int power;
	
	public Marine(){
		super("MARINE", 150);
		this.power = 15;
	}
	
	public void Attackable(Unit unit) {
		unit.hp -= this.power;
	}

}
