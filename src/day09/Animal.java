package day09;

//动物类
public class Animal {
	//属性
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//方法
	public void sleep(){
		System.out.println("动物睡觉");
	}
	public void eat(){
		System.out.println("动物吃东西");
	}
	
	//构造方法
	public Animal(String name,int age) {
		System.out.println("父类带参数的构造方法");
		this.name = name;
		this.age=age;
	}
	public Animal() {
		System.out.println("动物类默认构造方法");
	}

}
