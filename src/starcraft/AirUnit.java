package starcraft;

abstract class AirUnit extends Unit {
	
	public AirUnit(String name, int hp) {
		super(name, hp);
	}
	
	protected void flying() {
		System.out.println("이 유닛은 날 수 있습니다.");
	}
	


}
