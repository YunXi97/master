package day10.test02;

public class ShareBike extends Share {

	@Override
	public double getCount() {
		//骑自行车总价
		//不满一个小时按一个小时计算
		int hour=this.getMinute()%60==0?this.getMinute()/60:this.getMinute()/60+1;
		//计算总价
		return this.getPrice()*hour;
	}

	public ShareBike() {}
	
	public ShareBike(double price,int minute){
		this.setPrice(price);
		this.setMinute(minute);
	}
	
	

}
