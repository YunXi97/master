package day10.test02;

public class ShareCar extends Share {
	private int mileage;//里程
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
	//构造方法
	public ShareCar() {}
	public ShareCar(double price,int minute,int mileage) {
		this.setMileage(mileage);
		this.setMinute(minute);
		this.setPrice(price);
	}
	
	
	@Override
	public double getCount() {
		//计算总价  每10分钟1元  超过10公里后 每公里需要加1元
		int min=this.getMinute()%10==0?this.getMinute()/10:this.getMinute()/10+1;
		//判断要付钱的里程
		int mil=this.mileage-10;
		int milPrice=0;
		if(mil>0)
			milPrice=mil*1;
		return min*this.getPrice()+milPrice;
	}

}
