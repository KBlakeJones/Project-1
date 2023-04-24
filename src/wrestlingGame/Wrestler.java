package wrestlingGame;

public class Wrestler {
	
	private double health;
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
	public Wrestler getInstance(String choice) {
		switch (choice) {
		case "A":
			return new hillbilly();
		case "B":
			return new smartMark();
		case "C": 
			return new FamilyFirst();
		}
		return null;
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
