package starcraft;

public class Scv extends GroundUnit implements Repairable {
	private int power;
	
	public Scv(){
		super("SCV", 200);
		this.power = 10;
	}
	
	protected void repair(Repairable unit) {
		if(unit instanceof Unit) {
			Unit target = (Unit) unit;
			while(target.hp < target.MAX_HP) {
				target.hp ++;
				String message = String.format("%s 수리중 [%d/%d]", target.name, target.hp, target.MAX_HP);
				System.out.println(message);
				
				try {
					Thread.sleep(600);
				} catch (Exception e) {
				}
			}
			System.out.println("수리 완료!");
		}
	}
	
	public void Attackable(Unit unit) {
		unit.hp -= this.power;
	}
}
