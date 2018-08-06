package day13.test03;

public class ShareCar extends Share{
	
	private int mileage;//���
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
	//���췽��
	public ShareCar() {}
	public ShareCar(double price,int minute,int mileage) {
		this.setMileage(mileage);
		this.minute=minute;
		this.price=price;
	}
	
	
	@Override
	public double getCount() {
		//�����ܼ�  ÿ10����1Ԫ  ����10����� ÿ������Ҫ��1Ԫ
		int min=this.getMinute()%10==0?this.getMinute()/10:this.getMinute()/10+1;
		//�ж�Ҫ��Ǯ�����
		int mil=this.mileage-10;
		int milPrice=0;
		if(mil>0)
			milPrice=mil*1;
		return min*this.getPrice()+milPrice;
	}

}
