package wrestlingGame;

import java.util.Scanner;

public class Controller2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		String result; 
		Wrestler wrestler = new Wrestler();
		Scene a = new Scene();
		System.out.println("Welcome to WrestleCrania! You'll have to use your brain to make it to the main event.");

		do {
			System.out.println("Are you ready to start a game?(y/n)");
			result = in.next();
			result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Great, let's get you set up!");
		} else if (result.equals("n")) {
			System.out.println("Come back when you're ready chump!");
			continue;
		} else 
			System.out.println("Please enter yes or no");
		}while (!result.equals("y"));

		System.out.println("Choose a name for your wrestler:");
		name = in.next();
		System.out.println("Great name " + name + "! \nNow let's look at some training options.");
		
		System.out.println("Please choose A, B, or C");
		System.out.println(a.getScene1() + a.getScene2() + a.getScene3());
		do {
		try {
		result = in.next();
		result = (result.toUpperCase().substring(0, 1));
		wrestler = Wrestler.getInstance(result);
		}catch (IllegalArgumentException e){  
			System.out.println(e.getMessage());
		}			
		
		} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));

		
		System.out.println("Great choice " + name + " your initial values are set to ");
		System.out.println("Health: " + wrestler.getHealth());
		System.out.println("Strength: " + wrestler.getStrength());
		System.out.println("Experience: " + wrestler.getExperience());
		System.out.println("Promo: " + wrestler.getPromo());
		
		System.out.println("You ready for your first match?");
		
		do {
			try {
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			wrestler.setHealth(Wrestler.getInstance2(result) + wrestler.getHealth());
			if (result.equals("A")) {
				System.out.println(a.getScene7());
//				wrestler.getHealth();
			} else if (result.equals("B")) {				
				System.out.println(a.getScene8());
//				return;
			} else if(result.equals("C")) {
//				wrestler.setHealth(wrestler.getHealth() - 10);
				System.out.println(a.getScene9());
			} else
				System.out.println("Please Pick A, B or C");
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
//		wrestler.setHealth(wrestler.getHealth() + Wrestler.getInstance2(result));
		
		System.out.println("hijdfhlfkjhfhsao");
		System.out.println(wrestler.getHealth());

	}
	

}
