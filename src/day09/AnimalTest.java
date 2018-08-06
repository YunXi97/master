package day09;

public class AnimalTest {

	public static void main(String[] args) {
		//初始化一个Cat对象
		Cat c=new Cat("Tom",5,"black");
		System.out.println(c.getAge()+"  "+c.getName()+"  "+c.getColor());
		c.eat();
		c.catchMouse();
		
		//初始化一个Dog对象
		Dog d=new Dog("zhungzhung",3,23);
		System.out.println(d.getAge()+"  "+d.getName()+"  "+d.getWeight());
		d.eat();
		d.swimming();

	}

}
