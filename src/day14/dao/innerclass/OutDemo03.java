package day14.dao.innerclass;

public class OutDemo03 {
	//属性
	String name;
	static int sex;
	
	public void methodA(){
		System.out.println("外部类的实例方法");
	}
	/**
	 * 局部内部类
	 *    位置：方法中
	 *    成员：必须都是实例成员
	 *    只能在声明的方法内使用
	 * 
	 * */
	
	public void methodB(){
		
		int num=13;//常量
		class Inner02{
			String name;
			int age;
			
			public void methodC(){
				//局部内部类可以访问外部类的所有成员
				System.out.println(sex);
				System.out.println(name);
				//访问外部类  方法内的局部变量
				System.out.println(num);
				//num=24;//常量不可改变
				
				System.out.println("局部内部类的实例方法");
			}
			
			//public static void methodD(){}
			
		}
		Inner02 in=new Inner02();
		in.name="fafs";
		in.age=42;
		in.methodC();
		
	}
	

	public static void main(String[] args) {
		//初始化一个外部类对象
		OutDemo03 out=new OutDemo03();
		out.methodB();
	

	}

}
