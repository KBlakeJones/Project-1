package wrestlingGame;

import java.util.Scanner;

public class Matches2 extends Scene{
	public Matches2() {
		Scanner in = new Scanner(System.in);
		String result = null;
		Scene a = new Scene();
		
		do {
			try {
			result = in.next();
			result = (result.toUpperCase().substring(0, 1));
			if (result.equals("A")) {
				System.out.println(a.getScene13());
			} else if (result.equals("B")) {
				System.out.println(a.getScene14());
			} else if(result.equals("C")) {
				System.out.println(a.getScene15());
			} else
				System.out.println("Please Pick A, B or C");
			}catch (NullPointerException e){
				System.out.println("Please enter A, B, or C ");
			}
			} while(!result.equals("A") && !result.equals("B") && !result.equals("C"));
		
//		in.close();
	}


}
