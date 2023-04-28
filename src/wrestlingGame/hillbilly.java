package wrestlingGame;

public class hillbilly extends Wrestler{
	
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



}
