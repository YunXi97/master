package day09;

public class Dog extends Animal{

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//特有行为
	public void swimming(){
		System.out.println("狗游泳");
	}

	//构造方法
	public Dog(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}

	public Dog() {
		super();
	}
}
