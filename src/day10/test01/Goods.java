package day10.test01;

public abstract class Goods {
	private int price;

	public Goods() {
		super();
	}

	public Goods(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//�����ӡ��Ʒ�۸���
	public abstract void printPrice();

}
