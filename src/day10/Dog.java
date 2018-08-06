package day10;

public class Dog extends Pet{
	
	public Dog(){
	}
	public Dog(int health){
		this.setHealth(health);
	}
	
	
	@Override
	public void doEat() {
		if(this.getHealth()<30){
			System.out.println("Œππ∑≥‘π∑¡∏");
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

}
