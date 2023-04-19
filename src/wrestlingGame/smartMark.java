package wrestlingGame;

public class smartMark extends Wrestler {
	
	double health = 50;
	double experience = 40;
	double strength = 40;
	double promo = 40;
	
	public smartMark() {
		
	}
	
	public smartMark(double health, double experience, double strength, double promo) {
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
