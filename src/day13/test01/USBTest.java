package day13.test01;

public class USBTest {
	public static void method(USBInterface usb){
		usb.loadingDrive();
		usb.doWork();
	}

	public static void main(String[] args) {
		//��ʼ��һ������
		Fan f=new Fan();
		f.loadingDrive();
		method(f);
		
		//��ʼ��һ�����
		Mouse m=new Mouse();
		m.loadingDrive();
		method(m);
		
		//��ʼ��һ��U��
		USBDrive d=new USBDrive();
		d.loadingDrive();
		method(d);
		
		
	}

}
