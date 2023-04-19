package wrestlingGame;

public class hillbilly extends Wrestler{
	
//	Wrestler w = new hillbilly();
//	private double inHealth;
//	private double inExperience; 
//	private double inStrength;
//	private double inPromo;
	
	double health = 50;	
	double experience = 35;
	double strength = 35;
	double promo = 35;
	
	
	public hillbilly () {
		
	}
	
	public hillbilly(double health, double experience, double strength, double promo) {
		this.health = health;
		this.experience = experience;
		this.strength = strength;
		this.promo = promo;
		
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
	

	
//	public hillbilly (double inHealth, double inExperience, double inStrength, double inPromo) {
//		this.setInHealth(inHealth);
//		this.setInExperience(inExperience); 
//		this.setInStrength(inStrength); 
//		this.setInPromo(inPromo);
//	}

//	public double getInHealth() {
//		return inHealth;
//	}
//
//	public void setInHealth(double inHealth) {
//		this.inHealth = inHealth;
//	}
//
//	public double getInExperience() {
//		return inExperience;
//	}
//
//	public void setInExperience(double inExperience) {
//		this.inExperience = inExperience;
//	}
//
//	public double getInStrength() {
//		return inStrength;
//	}
//
//	public void setInStrength(double inStrength) {
//		this.inStrength = inStrength;
//	}
//
//	public double getInPromo() {
//		return inPromo;
//	}
//
//	public void setInPromo(double inPromo) {
//		this.inPromo = inPromo;
//	}
//	


}
