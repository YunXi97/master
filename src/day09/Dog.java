package day09;

public class Dog extends Animal{

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//������Ϊ
	public void swimming(){
		System.out.println("����Ӿ");
	}

	//���췽��
	public Dog(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}

	public Dog() {
		super();
	}
}
