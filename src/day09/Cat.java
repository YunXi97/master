package day09;

public class Cat extends Animal{
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void catchMouse(){
		System.out.println("猫抓老鼠");
		
	}
	
	//构造方法
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	public Cat() {
		super();
	}
	

}
