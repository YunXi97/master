package day14.enums;

/**
 * 定义一个枚举类
 * 
 * */
enum Weekday{
	/**
	 * 默认继承java.lang.enum
	 *   
	 * 使用过程中只用声明常量
	 * 多个常量之间用逗号隔开
	 * 常量必须放在第一行
	 * 常量都是引用数据类型  都是当前枚举类型的对象
	 * */
	MON,TUES,WEDNES,THURS,FRI,SATUR,SUN;
	
	//枚举类内部，可以声明字段 方法 构造方法 内部类，必须放在常量之后
	int age;
	public void methodA(){
		System.out.println("搬砖");
	}
	
	//构造方法  必须私有
	private Weekday(){}
	private Weekday(String name){}
}


public class Employee {
	//属性
	private Weekday restDay;

	public Weekday getRestDay() {
		return restDay;
	}

	public void setRestDay(Weekday restDay) {
		this.restDay = restDay;
	}

	//判断是否是休息日
	public void weekend(){
		switch(this.restDay){
		case MON:
		case TUES:
		case WEDNES:
		case THURS:
		case FRI:
		case SATUR:
			System.out.println("搬砖日");
			break;
		case SUN:
			System.out.println("休息日");
		}
		
	}
	
	
	public static void main(String[] args) {
		//初始化一个对象
		Employee em=new Employee();
		em.setRestDay(Weekday.MON);
		em.weekend();
		
		//获取枚举对象的名称
		String name=Weekday.SUN.name();
		System.out.println(name);
		//获取枚举类型的名称
		name=Weekday.FRI.toString();
		System.out.println(name);
		//获取枚举对象  常量的序列号
		int index=Weekday.MON.ordinal();
		System.out.println(index);
		//获取所有枚举常量  返回一个数组
		Weekday[]arr=Weekday.values();
		for(Weekday wd:arr){
			System.out.println(wd);
		}
		//将String类型转换为枚举常量   要求String名称必须和枚举类型常量名一致
		Weekday w=Weekday.valueOf("TUES");
		System.out.println(w);
		
		
		
		
		
		
		
		
		
		
		
	}

}
