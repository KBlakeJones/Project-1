package wrestlingGame;

import java.util.Scanner;

public class MegaMatches {
	
	public MegaMatches() {
		Scanner in = new Scanner(System.in);
		String result = null;
		Scene a = new Scene();
		Wrestler wrestler = new Wrestler();
		
		
		do {
			try {
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			wrestler.setHealth(Wrestler.resetHealth(result) + wrestler.getHealth());
			if (result.equals("A")) {
				System.out.println(a.getScene7());
			} else if (result.equals("B")) {	
				System.out.println(a.getScene8());
				do {
					System.out.println("Next match");
					System.out.println(a.getScene10() + a.getScene11() + a.getScene12());
					try {
						result = in.next();
						result = (result.toUpperCase().substring(0, 1));
					System.out.println("Next match");
					System.out.println(a.getScene10() + a.getScene11() + a.getScene12());
					if (result.equals("A")) {
						System.out.println("aaaaaa");
					}else if (result.equals("B")) {
						System.out.println("bbbbbbb");
					}else if (result.equals("C")) {
						
					}else
						System.out.println("Please dude A, B, or C");
					}catch (NullPointerException e) {
						System.out.println("Please pick A, B, or C");
					}
				}while (!result.equals("A") && !result.equals("B") && !result.equals("C"));
			} else if(result.equals("C")) {
				System.out.println(a.getScene9());
			} else
				System.out.println("Please Pick A, B or C");
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
//			wrestler.setHealth(wrestler.getHealth() + Wrestler.getInstance2(result));
	
//		in.close();
	}

}
