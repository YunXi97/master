package day14.dao.innerclass;

//声明一个接口
interface MyInterface{
	public void sendMsg(String msg);
	static class in{}//声明一个默认的静态内部类
}


public class OutDemo04 {
	public static void methodC(MyInterface face){
		face.sendMsg("Hello World");
	}
	/**
	 * 匿名内部类：当前这个类没有名字
	 * 位置：方法内
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		//定义了一个匿名的类   类的名字不知道，但这个类实现了接口
		MyInterface face=new MyInterface() {
			
			@Override
			public void sendMsg(String msg) {
				System.out.println(msg);
			}
		};
		
		methodC(face);

	}

}
