package day10.test02;

public class Business {
	
	public static double toPay(Share share){
		//�����ܼ�
		return share.getCount();
	}

	public static void main(String[] args) {
		//��ʼ��һ������������
		ShareBike bike=new ShareBike(1, 128);
		System.out.println(toPay(bike));
		
		//��ʼ��һ��������������
		ShareCar car=new ShareCar(10, 63, 40);
		System.out.println(toPay(car));
	}

}
