package day13.test03;

public class Business {

	public static double toPay(Share share){
		//�����ܼ�
		return share.getCount();
	}

	public static void main(String[] args) {
		//��ʼ��һ������������
		ShareBike bike=new ShareBike(1, 128);
		System.out.println("���������й�����һ�����ѣ�"+toPay(bike)+"Ԫ");
		
		//��ʼ��һ��������������
		ShareCar car=new ShareCar(10, 63, 40);
		System.out.println("������ʹ�ù�������һ�����ѣ�"+toPay(car)+"Ԫ");
	}

}
