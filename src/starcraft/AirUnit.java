package starcraft;

abstract class AirUnit extends Unit {
	
	public AirUnit(String name, int hp) {
		super(name, hp);
	}
	
	abstract void flying();
}
