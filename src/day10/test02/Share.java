package day10.test02;

//����
public abstract class Share {
	
	private double price;// ����
	private int minute;//ʱ�� ����
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
	
	//�����ܼ�
	public abstract double getCount();
}
