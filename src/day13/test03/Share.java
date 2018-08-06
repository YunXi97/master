package day13.test03;

//定义一个抽象类  用来继承Share接口
public abstract class Share implements ShareInterface{
	public double price=0;// 单价
	public int minute=0;//时间 分钟
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
}
