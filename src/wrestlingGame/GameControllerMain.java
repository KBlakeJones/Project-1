package wrestlingGame;

import java.util.Scanner;

public class GameControllerMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to WrestleCrania! -----------");
		System.out.println("Would you like to play a game?");
		String result = in.next();
		result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Great, let's get you set up!");
			
		} else
			System.out.println("Come back when you're ready chump!");
		// possibly change to do while loop or if else if?
		//don't let it pass else if you choose no
		System.out.println("Choose a name for your wrestler:");
		result = in.next();
		System.out.println("Great name " + result + "! Now let's look at some training options.");
		
		Wrestler n = new hillbilly(); //can i set hillbilly to a user input through scanner for the 3 options in.next
		System.out.println(n.getHealth());
		System.out.println(n.getExperience());
		System.out.println(n.getStrength());
		System.out.println(n.getPromo());
		
//		Wrestler s = new Wrestler();    I don't think I need this to run, but want to try
		System.out.println("next wrestler");
		Wrestler f = new FamilyFirst();
		System.out.println(f.getHealth());
		System.out.println(f.getExperience());
		System.out.println(f.getStrength());
		System.out.println(f.getPromo());
		
		
		
		
		
		
		
	
		Scene a = new Scene();
		System.out.println(a.getScene1());
		
		System.out.println("You ready?");
		result = in.next();
		//add in if yes then this
		//if no then loop to front come back when you're ready chump or another catch-phrase
		
		
		
		
		in.close();
	}

}
