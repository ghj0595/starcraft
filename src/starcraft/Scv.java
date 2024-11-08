package starcraft;

public class Scv extends GroundUnit implements Repairable {
	
	public Scv(){
		super("SCV", 200);
	}
	
	protected void repair(Repairable unit) {
		if(unit instanceof Unit) {
			Unit target = (Unit) unit;
			while(target.hp < target.HP_MAX) {
				target.hp ++;
				String message = String.format("%s 수리중 [%d/%d]", target.name, target.hp, target.HP_MAX);
				System.out.println(message);
				
				try {
					Thread.sleep(600);
				} catch (Exception e) {
				}
			}
			System.out.println("수리 완료!");
		}
	}
}
