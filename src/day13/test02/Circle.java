package day13.test02;

public class Circle implements Shape {
	//public static final double PI=3.14;
	private double r;

	//构造方法
	public Circle() {}
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return Math.PI*r*r;
	}

	@Override
	public double perimeter() {
		return 2*Math.PI*r;
	}

}
