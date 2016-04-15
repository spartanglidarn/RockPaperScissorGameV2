
public class Rock extends Weapon {
	
	public Rock (String name) {
		super(name);
	}
	

	//Method that takes the attackers weapon and sends this wepon to the attackers attackedBy method. 
	public String attack (Weapon w) {
		return w.attackedBy(getName());
	}

	//checks what weapon the method has been attacked with and returns a result of the round.
	public String attackedBy(String t) {
		String result = "";
		switch (t) {
			case "rock":	result = "draw";
				break;
			case "paper":	result = "win";
				break;
			case "scissor":	result = "lose";
				break;
			case "spock":	result = "win";
				break;
			case "lizard":	result = "lose";
				break;
			default: 		result = "Error: no result";
				break;	
		}
		
		return result;
	}	
}