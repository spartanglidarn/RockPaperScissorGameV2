import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//create a new instace of every weapon . 
		Weapon r = new Rock("rock");
		Weapon p = new Paper("paper");
		Weapon s = new Scissor("scissor");
		Weapon sp = new Spock("spock");
		Weapon l = new Lizard("lizard");
		//initialize variables
		String opponent = "";
		String result = ""; 
		String resultText = "";
		
		int wins = 0;
		int losses = 0;
		int draw = 0;
		
		//take in a number of rounds that will be played.
		Scanner nrOfRounds = new Scanner(System.in);
		System.out.print("How many rounds ");
		int rounds = nrOfRounds.nextInt();
		System.out.println("Game started");
		
		//save the results of every round in a arraylist
		ArrayList<String> resultList = new ArrayList<String>();
		
		//create a game loop that loops every round and checks who wins that round
		for(int i=1; i <= rounds; i++) {
			
			//takes the user choice of weapon
			Scanner player = new Scanner(System.in);
			System.out.print("Choose your weapon ");
			String playerChoice = player.next();
			
			// Creates a random number between 1 and 3 and then assign a choice
			// to each value for the users opponent.
			Random rand = new Random();
			int n = rand.nextInt(5) + 1;
			//Add a string value to the random number
			//Create a attackWeapon variable depending on the computers weapon
			
			Weapon attackWeapon = r;
			switch (n) {
				case 1: opponent = "rock";
						attackWeapon = r;
					break;
				case 2: opponent = "paper"; 
						attackWeapon = p;
					break;
				case 3:	opponent = "scissor";
						attackWeapon = s;
					break;
				case 4: opponent = "spock";
						attackWeapon = sp;
					break;
				case 5: opponent = "lizard";
						attackWeapon = l;
					break;
				default:opponent = "could not chose a opponent!";
					break;
			}		
			
			//assign user input to user variable. (is used for testing)
			String user = playerChoice;
			
			//check the user input and sends the computer weapon and user weapon to appropriate class and method.
			if (Objects.equals(user, new String("rock"))) {
				result = r.attack(attackWeapon);
				
			} else if (Objects.equals(user, new String("paper"))) {
				result = p.attack(attackWeapon);
				
			} else if (Objects.equals(user, new String("scissor"))) {
				result = s.attack(attackWeapon);

			} else if (Objects.equals(user, new String("spock"))) {
				result = sp.attack(attackWeapon);

			} else if (Objects.equals(user, new String("lizard"))) {
				result = l.attack(attackWeapon);

			} else { //if the user did not choose rock paper or scissor the for loop breaks and the game ends.
				System.out.println("You need to write 'rock', 'paper', 'scissor', 'spock' or lizard");
				break;
			}
			
			//Switch statement to show the user who won the round.
			switch(result) {
				case "win":
						resultText = ". You win!";
						break;
				case "lose":
						resultText = ". Your opponent wins!";
						break;
				case "draw":
						resultText = ". Its a draw";
						break;
			}
			//Displaytext after every round
			System.out.println("You chose " + user + ", your opponent chose " + opponent + resultText);
			//add the result to resultList array
			resultList.add(result);
			
	}//end of for loop (game-loop)
	//print out the result list
	System.out.println(resultList);
	
	//loop through the result list and see how many times the user won, how many time the computer won and how many times there was a draw. 
	 
	for (int i = 0; i < resultList.size(); i++) {
		if (Objects.equals(resultList.get(i), new String("win"))) {
			wins++;
		} else if (Objects.equals(resultList.get(i), new String("lose"))) {
			losses++;
		} else if (Objects.equals(resultList.get(i), new String("draw"))) {
			draw++;
		}
	}
	
	//Print out the end result
	String endResult = "";
	if (wins == losses) {
		endResult = "It's a tie!";
	} else if (wins > losses) {
		endResult = "You win!";
	} else if (losses > wins) {
		endResult = "Your oponent wins!";
	}
	
	System.out.println("Result: You won " + wins + " time, your opponent won " + losses + " time. " + endResult);
	
} //main method
} //main class
