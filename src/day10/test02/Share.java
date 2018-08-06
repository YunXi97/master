package day10.test02;

//父类
public abstract class Share {
	
	private double price;// 单价
	private int minute;//时间 分钟
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	//计算总价
	public abstract double getCount();
}
