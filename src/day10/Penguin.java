package day10;

public class Penguin extends Pet{
	@Override
	public void doEat() {
		if(this.getHealth()<40){
			System.out.println("Œπ∆Û∂Ï≥‘”„");
		}
		int health = this.getHealth();
		while(this.getHealth()<100){
			health+=10;
			this.setHealth(health);
			System.out.println(this.getHealth());

		}
		if(this.getHealth()>=100){
			this.setHealth(100);
			System.out.println("≥‘±•¡À");
		}
		
		
	}

	public Penguin() {}
	public Penguin(int health) {
		this.setHealth(health);
	}
	
}
