package wrestlingGame;

public class Wrestler {
	
	private static double health;
	private double experience; 
	private double strength; 
	private double promo;

	public Wrestler() {
		
	}
	public Wrestler(double health, double experience, double strength, double promo) {
		this.health = health;
		this.experience = experience;
		this.strength = strength;
		this.promo = promo;
	}
	
	public static Wrestler getInstance(String choice) {
		switch (choice) {
		case "A":
			return new hillbilly();
		case "B":
			return new smartMark();
		case "C": 
			return new FamilyFirst();
		}
		throw new IllegalArgumentException("Please pick A, B, or C ");
			
	}	
 
	public static double resetHealth(String result) {
		switch (result) {
		case "A":
			  return -20;
		case "B":
			 return 20;
		case "C": 
			 return 10;
		}
		return 0;
	}
	
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public double getStrength() {
		return strength;
	}
	public void setStrength(double strength) {
		this.strength = strength;
	}
	public double getPromo() {
		return promo;
	}
	public void setPromo(double promo) {
		this.promo = promo;
	} 
	
	

}
