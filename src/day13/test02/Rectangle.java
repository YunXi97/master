package day13.test02;

//����ʵ����
public class Rectangle implements Shape{ 
	private double width;//��
	private double lenth;//��
	
	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getLenth() {
		return lenth;
	}


	public void setLenth(double lenth) {
		this.lenth = lenth;
	}


	//���췽��
	public Rectangle() {}
	
	public Rectangle(double width, double lenth) {
		this.width = width;
		this.lenth = lenth;
	}


	@Override
	public double area() {
		return width*lenth;
		
	}
	@Override
	public double perimeter() {
		return (width+lenth)*2;
	}

}
