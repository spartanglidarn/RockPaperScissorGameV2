
public abstract class Weapon {
	
	private String name;
	public Weapon (String theName) {
		name = theName;
	}
	
	public String getName() {
		return name;
	}	

	public abstract String attack(Weapon w);
	public abstract String attackedBy(String t);
}
