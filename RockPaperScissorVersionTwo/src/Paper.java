
public class Paper extends Weapon{
	String name = "paper";
	
	//Method that takes the attackers weapon and sends this wepon to the attackers attackedBy method. 	
	public String attack(Weapon w) {
		return w.attackedBy(name);
	}
	
	//checks what weapon the method has been attacked with and returns a result of the round.	
	public String attackedBy(String t) {
		String result = "";
		switch (t) {
			case "rock":	result = "lose";
				break;
			case "paper":	result = "draw";
				break;
			case "scissor":	result = "win";
				break;
			default: 		result = "Error: no result";
				break;
		}
		
		return result;
	}	
}