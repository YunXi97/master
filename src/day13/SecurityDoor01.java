package day13;
/**
 * 实现类
 * 
 * */
public class SecurityDoor01 extends Door implements FirstInterface,SecondInterface{
	@Override
	public void lock() {
		System.out.println("虹膜识别上锁");
		
	}
	@Override
	public void unlock() {
		System.out.println("虹膜解锁");
		
	}
	
	@Override
	public void fireProof() {
		System.out.println("自动报警   自动喷水");
		
	}

}
