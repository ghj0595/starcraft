package starcraft;

interface Repairable{
	
}

interface Attackable{
	public void attack(Unit unit);
}

abstract class Unit {
	protected final int HP_MAX;
	
	protected String name;
	protected int hp;
	
	public Unit(String name, int hp){
		this.name = name;
		this.hp = hp;
		this.HP_MAX = hp;		
	}
}
