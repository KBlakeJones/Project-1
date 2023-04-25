package wrestlingGame;

import java.util.Scanner;

public class GameControllerMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String result; 
		Wrestler wrestler = new Wrestler();
		Scene a = new Scene();
		System.out.println("Welcome to WrestleCrania! You'll have to use your brain to make it to the main event.");

		do {
			System.out.println("Are you ready to start a game?");
			result = in.next();
			result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Great, let's get you set up!");
		} else if (result.equals("n")) {//else if No then this
			System.out.println("Come back when you're ready chump!");
			continue;
		} else 
			System.out.println("Please enter yes or no");
		}while (!result.equals("y"));
		
		//(!result.equals("y"));
		//try catch with exceptions for incorrect input 
		//if you enter 1 instead of yes or no it 
		// possibly change to do while loop?
		//don't let it pass else if you choose no
		System.out.println("Choose a name for your wrestler:");
		result = in.next();
		System.out.println("Great name " + result + "! Now let's look at some training options.");
		


		System.out.println("choose a b c ");
		do {
		try {
//******		Wrestler wrestler =  new Wrestler();
		result = in.next();
		result = (result.toUpperCase().substring(0, 1));
		wrestler = Wrestler.getInstance(result);
		System.out.println(wrestler.getExperience());
		System.out.println(wrestler.getHealth());
		}catch (NullPointerException e){
			System.out.println("Please enter A, B, or C ");
			
		}
		} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
		System.out.println(wrestler.getHealth());
		System.out.println(wrestler.getStrength());
		System.out.println(wrestler.getPromo());
		System.out.println(wrestler.getInstance2("A"));
		System.out.println("Diet important choose a b c ");
		do {
			try {
//******			Wrestler wrestler =  new Wrestler();
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			wrestler = wrestler.getInstance(result);
			System.out.println(wrestler.getExperience());
			System.out.println(wrestler.getHealth());
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		

	
		System.out.println(a.getScene1());
		
		System.out.println("You ready?");
		result = in.next();
		result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Great, you have bookings for the following, please choose one");
		} else if (result.equals("n")){//else if No then this
			System.out.println("Come back when you're ready chump!");
		} else {
			System.out.println("Please enter yes or no");
		}
		
		System.out.println("Which match would you like to try first?");
		
		do {
			try {
	//******		Wrestler wrestler =  new Wrestler();
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			if (result.equals("A")) {
				System.out.println(a.getScene4());
			} else if (result.equals("B")) {
				System.out.println(a.getScene5());
			} else if(result.equals("C")) {
				System.out.println(a.getScene6());
			} else
				System.out.println("Please Pick A, B or C");
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
		
		
		in.close();
	}

}
