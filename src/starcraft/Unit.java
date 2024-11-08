package starcraft;

interface Repairable{
	
}

interface Attackable{
	public void attack(Unit unit);
}

abstract class Unit {
	protected final int MAX_HP;
	
	protected String name;
	protected int hp;
	
	public Unit(String name, int hp){
		this.name = name;
		this.hp = hp;
		this.MAX_HP = hp;
		
		String message = String.format("%s 생산 완료!", name);
		System.out.println(message);
	}
	
	@Override
	public String toString() {		
		String info = String.format("%s [%d/%d]", name, hp, MAX_HP);
		return info;
	}
}
