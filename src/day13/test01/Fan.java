package day13.test01;

public class Fan implements USBInterface{
	@Override
	public void loadingDrive() {
		System.out.println("װ��USB��������");
	}
	@Override
	public void doWork() {
		System.out.println("����ת��");
		
	}

}
