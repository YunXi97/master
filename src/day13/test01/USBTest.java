package day13.test01;

public class USBTest {
	public static void method(USBInterface usb){
		usb.loadingDrive();
		usb.doWork();
	}

	public static void main(String[] args) {
		//初始化一个风扇
		Fan f=new Fan();
		f.loadingDrive();
		method(f);
		
		//初始化一个鼠标
		Mouse m=new Mouse();
		m.loadingDrive();
		method(m);
		
		//初始化一个U盘
		USBDrive d=new USBDrive();
		d.loadingDrive();
		method(d);
		
		
	}

}
