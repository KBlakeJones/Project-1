package wrestlingGame;

import java.util.Scanner;

public class Controller2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		String result; 
		Wrestler wrestler = new Wrestler();
		Scene a = new Scene();
		Double health;
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
		System.out.println("\nGreat name " + name + "! \nNow let's look at some training options.");
		
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
		
		do {
			System.out.println("\nAre you ready for your first match(y/n)");
			result = in.next();
			result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("\nGreat " + name +  " you have these available bookings. \nPlease choose match A, B or C \n" + a.getScene4() + a.getScene5() + a.getScene6());
		} else if (result.equals("n")) {
			System.out.println("Come back when you're ready chump!");
			break;
		} else 
			System.out.println("Please enter yes or no");
		}while (!result.equals("y"));
		
		do {
			try {
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			wrestler.setHealth(Wrestler.resetHealth(result) + wrestler.getHealth());
			if (result.equals("A")) {
				System.out.println(a.getScene7());
			} else if (result.equals("B")) {				
				System.out.println(a.getScene8());
			} else if(result.equals("C")) {
				System.out.println(a.getScene9());
			} else
				System.out.println("Please Pick A, B or C");
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
		System.out.println("\nLet's get to match 2 ");
		System.out.println("You have the following bookings available, select one.");
		System.out.println(a.getScene10()+ a.getScene11() + a.getScene12());

		do {
			try {
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			wrestler.setHealth(wrestler.getHealth() + Wrestler.resetHealth(result));
			if (result.equals("A")) {
				System.out.println(a.getScene13());
			} else if (result.equals("B")) {
				System.out.println(a.getScene14());
			} else if(result.equals("C")) {
				System.out.println(a.getScene15());
			} else
				System.out.println("Dude seriously A, B, or C. You should get it by now.");
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
		System.out.println("\nLast match to raise your stock before the Mania matches are set.\nReady to see your bookings?(y/n)");
		
		do {
			result = in.next();
			result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Heres what we got\nBetter bring the house down\n" + a.getScene16() + a.getScene17() + a.getScene18());
		} else if (result.equals("n")) {
			System.out.println("Figured you'd tap out eventually.");
			break;
		} else 
			System.out.println("Bruuuuuhhhh, you don't know this is yes or no yet?");
		}while (!result.equals("y"));
		
		do {
			try {
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			wrestler.setHealth(wrestler.getHealth() + Wrestler.resetHealth(result));
			if (result.equals("A")) {
				System.out.println(a.getScene19());
			} else if (result.equals("B")) {
				System.out.println(a.getScene20());
			} else if(result.equals("C")) {
				System.out.println(a.getScene21());
			} else
				System.out.println("Dude seriously A, B, or C. You should get it by now.");
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
		System.out.println("\nYour final health is " + wrestler.getHealth());
		
		do {
			System.out.println("\nAre you ready to see your Mania booking?(y/n)");
			result = in.next();
			result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("");
		} else if (result.equals("n")) {
			System.out.println("Pressure was too much huh? Back to the indies dork!");
			break;
		} else 
			System.out.println("Please enter yes or no");
		}while (!result.equals("y"));
			
		health = wrestler.getHealth();
		if (health >= 100) {
			System.out.println(a.getScene22());
			if(health == 110) {
				System.out.println(a.getScene26());
			}else
				System.out.println(a.getScene27());
		}else if (health >= 70) {
			System.out.println(a.getScene23());
			if (health >= 80) {
				System.out.println(a.getScene28());
			}else
				System.out.println(a.getScene29());
		}else if (health >= 60) {
			System.out.println(a.getScene24());
			
		}else
			System.out.println(a.getScene25());
		
		in.close();
	}
	

}
