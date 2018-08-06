package day14.dao.innerclass;

public class OutDemo02 {
	String name;//实例成员
	static int number;
	//外部类的方法
	public void methodA(){
		System.out.println("你好"+name);
	}
	public static void methodB(){
		System.out.println("外部类静态方法");
	}
	
	/**
	 * 静态内部类
	 *    位置：类中  方法外部
	 *    修饰：final abstract static private public protect
	 *    成员：静态  非静态
	 * 
	 * */
	static class Inner01{
		String name;
		static int age;
		public Inner01(){
			System.out.println("静态内部类构造方法");
		}
		
		public void methodA(){
			System.out.println("静态内部类的实例成员");
			number=234;
			name="王五";//代表的是内部类成员
			//OutDemo02.this.name="fre";//不允许访问外部的实例成员
		}
		public static void methodB(){
			System.out.println("静态内部类的静态成员");
		}
		
		
	}

	

	public static void main(String[] args) {
		OutDemo02.Inner01 in=new OutDemo02.Inner01();
		//访问内部类成员  可以访问所有成员 
		in.methodA();
		in.methodB();
		
		//直接访问内部类的静态成员  类名来访问
		Inner01.age=12;
		Inner01.methodB();

	}

}
