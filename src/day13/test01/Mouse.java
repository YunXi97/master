package day13.test01;

public class Mouse implements USBInterface{
	@Override
	public void loadingDrive() {
		System.out.println("装载鼠标驱动");
	}
	@Override
	public void doWork() {
		System.out.println("鼠标移动");
		
	}

}
