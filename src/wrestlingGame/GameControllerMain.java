package wrestlingGame;

import java.util.Scanner;

public class GameControllerMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to WrestleCrania! You'll have to use your brain to make it to the main event.");
		System.out.println("Are you ready to start a game?");
		String result = in.next();
		result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Great, let's get you set up!");
			
		} else if (result.equals("n")) {//else if No then this
			System.out.println("Come back when you're ready chump!");
		}else 
			System.out.println("Please enter yes or no");
		//try catch with exceptions for incorrect input 
		//if you enter 1 instead of yes or no it 
		// possibly change to do while loop or if else if?
		//don't let it pass else if you choose no
		System.out.println("Choose a name for your wrestler:");
		result = in.next();
		System.out.println("Great name " + result + "! Now let's look at some training options.");
		


		System.out.println("choose a b c ");
		try {
		Wrestler wrestler =  new Wrestler();
		result = in.next();
		result = (result.toUpperCase().substring(0, 1));
		wrestler = wrestler.getInstance(result);
		System.out.println(wrestler.getExperience());
		System.out.println(wrestler.getHealth());
		}catch (NullPointerException e){
			System.out.println("Please enter A, B, or C ");
		}
		

		Scene a = new Scene();
		System.out.println(a.getScene1());
		
		System.out.println("You ready?");
		result = in.next();
		result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Great, you have bookings for the following, please choose one");
			
		} else //else if No then this
			System.out.println("Come back when you're ready chump!");
		
		//add in if yes then this
		//if no then loop to front come back when you're ready chump or another catch-phrase
		
		
		
		
		in.close();
	}

}
