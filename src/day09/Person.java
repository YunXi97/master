package day09;

/**
 * 父类
 *    存放子类公共的特性和行为
 * */

public class Person {
	String name;//姓名
	int age;//年龄
	
	//方法
	public void sleep(){
		System.out.println("睡觉");
	}

	public Person(String name) {
		this();
		System.out.println("父类有参构造方法");
	}

	public Person() {
		System.out.println("父类无参构造方法");
	
	}

}
