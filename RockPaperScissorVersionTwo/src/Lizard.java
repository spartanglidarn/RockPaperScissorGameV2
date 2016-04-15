
public class Lizard extends Weapon{
	public Lizard (String name) {
		super(name);
	}
	
	//Method that takes the attackers weapon and sends this weapon to the attackers attackedBy method. 	
	public String attack(Weapon w) {
		return w.attackedBy(getName());
	}

	//checks what weapon the method has been attacked with and returns a result of the round.	
	public String attackedBy(String t) {
		String result = "";
		switch (t) {
			case "rock":	result = "win";
				break;
			case "paper":	result = "lose";
				break;
			case "scissor":	result = "win";
				break;
			case "spock":	result = "lose";
				break;
			case "lizard":	result = "draw";
				break;
			default: 		result = "Error: no result";
				break;
		}
		
		return result;
	}
}
