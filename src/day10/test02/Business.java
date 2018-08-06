package day10.test02;

public class Business {
	
	public static double toPay(Share share){
		//计算总价
		return share.getCount();
	}

	public static void main(String[] args) {
		//初始化一个共享单车对象
		ShareBike bike=new ShareBike(1, 128);
		System.out.println(toPay(bike));
		
		//初始化一个共享汽车对象
		ShareCar car=new ShareCar(10, 63, 40);
		System.out.println(toPay(car));
	}

}
