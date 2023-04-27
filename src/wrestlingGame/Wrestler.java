package wrestlingGame;

public class Wrestler {
	
	private static double health;
	private double experience; 
	private double strength; 
	private double promo;
	
	//NOT SURE I NEED THIS TO RUN, BUT IT'S HERE INCASE I DO. IT'S RUNNING WITHOUT IT CURRENTLY
	public Wrestler() {
		
	}
	public Wrestler(double health, double experience, double strength, double promo) {
		this.health = health;
		this.experience = experience;
		this.strength = strength;
		this.promo = promo;
	}
	
	//factory method 
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
	//.gethealth .sethealth 
	public static double getInstance2(String result) {
		switch (result) {
		case "A":
			  return health = health + 50;
		case "B":
			 return health = health + 30;
		case "C": 
			 return health = health + 20;
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
