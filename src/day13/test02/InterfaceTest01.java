package day13.test02;


public class InterfaceTest01 {
	
	public static void shape(Shape s){
		
		if(s instanceof Rectangle){
			System.out.println("该矩形面积为："+s.area());
			System.out.println("该矩形周长为："+s.perimeter());
		}
		if(s instanceof Circle){
			System.out.println("该圆面积为："+s.area());
			System.out.println("该圆周长为："+s.perimeter());
		}
	}
	
	public static void main(String[] args) {
		//初始化一个矩形
		Rectangle r=new Rectangle(4,6);
		//求图形面积和周长
		shape(r);
		//初始化一个圆
		Circle c=new Circle(4);
		//求图形面积和周长
		shape(c);
		
	}
}
