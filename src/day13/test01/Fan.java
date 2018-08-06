package day13.test01;

public class Fan implements USBInterface{
	@Override
	public void loadingDrive() {
		System.out.println("装载USB风扇驱动");
	}
	@Override
	public void doWork() {
		System.out.println("风扇转动");
		
	}

}
