package wrestlingGame;

import java.util.Scanner;

public class GameControllerMain {

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
//		System.out.println(wrestler.getInstance2("A"));
////		System.out.println("Diet important choose a b c ");
////		do {
//			try {
////******			Wrestler wrestler =  new Wrestler();
//			result = in.next();
//			result = (result.toUpperCase().substring(0, 1));
//			wrestler = wrestler.getInstance(result);
//			System.out.println(wrestler.getExperience());
//			System.out.println(wrestler.getHealth());
//			}catch (NullPointerException e){
//				System.out.println("Please enter A, B, or C ");
//			}
//			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
//		

	
		System.out.println("\n" + a.getScript());
		
		System.out.println("You ready " + name + "?");
		do {
		result = in.next();
		result = (result.toLowerCase().substring(0, 1));
		if(result.equals("y")) {
			System.out.println("Great, you have bookings for the following, please choose one");
		} else if (result.equals("n")){
			System.out.println("Come back when you're ready chump!");
		} else {
			System.out.println("Please enter yes or no");
		}
		}while(!result.equals("y"));
		//add do while to not let past unless y 
		
		System.out.println(a.getScene4() + a.getScene5() + a.getScene6());
		System.out.println("Which match would you like to try first?");
		
		new Matches();
		wrestler.setHealth(wrestler.getHealth() + Wrestler.getInstance2(result));
		System.out.println(wrestler.getHealth());
//		wrestler.setHealth(wrestler.getHealth() + Wrestler.getInstance2(result));
//		System.out.println(wrestler.getHealth());

//			try {
//			result = in.next();
//			result = (result.toUpperCase().substring(0, 1));
//			if (result.equals("A")) {
//				System.out.println(a.getScene7());
//			} else if (result.equals("B")) {
//				System.out.println(a.getScene8());
//			} else if(result.equals("C")) {
//				System.out.println(a.getScene9());
//			} else
//				System.out.println("Please Pick A, B or C");
//			}catch (NullPointerException e){
//				System.out.println("Please enter A, B, or C ");
//			}
//			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
//		
		
		System.out.println("\nLet's get to match 2 ");
		System.out.println("You have the following bookings available, select one.");
		System.out.println(a.getScene10()+ a.getScene11() + a.getScene12());
		
//		do {
//			try {
//			result = in.next();
//			result = (result.toUpperCase().substring(0, 1));
//			if (result.equals("A")) {
//				System.out.println(a.getScene13());
//			} else if (result.equals("B")) {
//				System.out.println(a.getScene14());
//			} else if(result.equals("C")) {
//				System.out.println(a.getScene15());
//			} else
//				System.out.println("Please Pick A, B or C");
//			}catch (NullPointerException e){
//				System.out.println("Please enter A, B, or C ");
//			}
//			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
		new Matches2();
		
		System.out.println("\nLet's get to match 3 ");
		System.out.println("You have the following bookings available, select one.");
		System.out.println(a.getScene16()+ a.getScene17() + a.getScene18());
		
		new Matches3();
		
		
		in.close();
	}

}
