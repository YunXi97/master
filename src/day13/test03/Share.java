package day13.test03;

//����һ��������  �����̳�Share�ӿ�
public abstract class Share implements ShareInterface{
	public double price=0;// ����
	public int minute=0;//ʱ�� ����
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
