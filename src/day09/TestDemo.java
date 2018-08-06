package day09;

public class TestDemo {
	public static void main(String[] args) {
		//入口方法
		//初始化一个Student对象  给对象进行赋值
		Student stu=new Student();
		stu.sid="32432";
		stu.name="张三";
		stu.age=13;
		stu.sleep();
		
		//初始化一个Teacher对象  给对象进行赋值
		Teacher th=new Teacher();
		th.level=5;
		th.name="李四";
		th.age=13;
		th.sleep();
		
		//初始化一个Employee对象  给对象进行赋值
		Employee em=new Employee();
		em.hireDate="32432";
		em.name="王五";
		em.age=13;
		em.sleep();
	}

}
