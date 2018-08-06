package day08;


public class Test01 {

	//private 字段  方法
	//在同类中可以访问
	private String name;//姓名
	public void study(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Test01 t=new Test01();
		t.name="jihgf";
		t.study();

	}

}
class TestDemo{
	public void method(){
		//初始化一个类
		Test01 t1=new Test01();
	}
}
