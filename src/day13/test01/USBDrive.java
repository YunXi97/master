package day13.test01;

public class USBDrive implements USBInterface{
	@Override
	public void loadingDrive() {
		System.out.println("装载U盘驱动");
	}
	@Override
	public void doWork() {
		System.out.println("U盘读写数据");
		
	}

}
