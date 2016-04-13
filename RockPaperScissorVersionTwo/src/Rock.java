
public class Rock extends Weapon {
	String name = "rock";

	//Method that takes the attackers weapon and sends this wepon to the attackers attackedBy method. 
	public String attack (Weapon w) {
		return w.attackedBy(name);
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
			default: 		result = "Error: no result";
				break;	
		}
		
		return result;
	}	
}