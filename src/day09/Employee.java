package day09;

/**
 * 子类继承于Person
 *    
 *    
 *    super 可以访问父类属性和方法
 *    super只能存在子类的方法中
 *    super可以存在
 * */
public class Employee extends Person{

	//属性
	String hireDate;//入职时间
	
	//行为
	public void sleep(){
		System.out.println("躺着睡觉");
	}
	
	
	public Employee() {
		super();
	}
	
//	public Employee() {
//		super();
//	}

	public Employee(String hireDate) {
		super();
		this.hireDate = hireDate;
	}

}
