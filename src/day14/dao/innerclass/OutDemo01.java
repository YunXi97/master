package day14.dao.innerclass;

/**
 * 内部类：
 *    在类的内部定义一个类，可以看做类的成员
 * 类的成员：
 *    字段，方法，类
 * 内部类类型：
 *    1.实例内部类
 *    2.静态内部类
 *    3.局部内部类
 *    4.匿名内部类  
 * 
 * 
 * */
public class OutDemo01 {

	//外部类的属性
	String name;//实例成员
	static int age;
	//外部类的方法
	public void methodA(){
		System.out.println("你好"+name);
	}

	 /**
	  * 实例内部类
	  *   位置： 类中 方法外
	  *   修饰符：public private  protected
	  *   不能用static
	  *    
	  *    类中定义的成员
	  *    不能使用static进行修饰
	  *    访问权限修饰符 都可以
	  *       
	  *    //内部类访问外部类的成员   
	  *       在内部类中可以直接访问外部类的成员(实例和静态)
	  *       
	  *    
	  */
	class Inner{
		//定义内部类的成员
		String name;//实例成员
		//static int number;//不能使用static进行修饰
		public void methodB(){
			System.out.println("实例内部类的方法"+name+age);
			OutDemo01.this.methodA();
		}
		
		public void methodC(){
			//如果外部类成员和内部类成员一致，默认访问的是内部类的成员
			//访问外部类成员
			System.out.println(OutDemo01.this.name);
			//调用外部类的methodA方法
			OutDemo01.this.methodA();
		}
		
		public void methodA(){
			System.out.println("内部类方法");
		}
		
		public Inner(){
			System.out.println("内部类构造方法");
		}
		
	}



	public static void main(String[] args) {
		//初始化一个外部类
		OutDemo01 out=new OutDemo01();
		//给外部类属性进行赋值
		out.name="张三";
		out.methodA();
		age=13;
		
		//初始化一个内部类对象
		Inner inner=out.new Inner();
		
		//给内部类属性赋值
		inner.name="李四";
		//访问内部类方法
		inner.methodA();
		inner.methodB();
		inner.methodC();


	}

}
