package day10.test02;

public class ShareBike extends Share {

	@Override
	public double getCount() {
		//�����г��ܼ�
		//����һ��Сʱ��һ��Сʱ����
		int hour=this.getMinute()%60==0?this.getMinute()/60:this.getMinute()/60+1;
		//�����ܼ�
		return this.getPrice()*hour;
	}

	public ShareBike() {}
	
	public ShareBike(double price,int minute){
		this.setPrice(price);
		this.setMinute(minute);
	}
	
	

}
