package day13;
/**
 * 防盗门
 *    具有门的特点
 *    具有锁的功能
 *    
 *    
 *    
 * 实现类
 *    如果类要实现某一个接口语法
 *    修饰符 class 类名  extends 父类  implement 接口1,接口2,...{
 *    	//必须重写接口中的方法
 *    } 
 * */
public class SecurityDoor extends Door implements FirstInterface,SecondInterface{
	@Override
	public void lock() {
		System.out.println("指纹上锁");
		
	}
	@Override
	public void unlock() {
		System.out.println("指纹解锁");
	}
	
	@Override
	public void fireProof() {
		System.out.println("喷干粉  自动报警");
		
	}
	

}
