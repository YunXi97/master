package day13;

public class InterfaceTest01 {
	//实现调用FirstInterface方法
	public static void methodA(FirstInterface face){
		face.lock();
		face.unlock();
	}
	
	//调用SecondInterface方法
	public static void methodB(SecondInterface face){
		face.fireProof();
	}

	public static void main(String[] args) {
	/*	//初始化一个安全门
		SecurityDoor door=new SecurityDoor();
		//调用方法
		door.openDoor();
		door.closeDoor();
		door.lock();
		door.unlock();
		door.fireProof();
		
		System.out.println("---------------------------------");
		SecurityDoor01 door01=new SecurityDoor01();
		door01.openDoor();
		door01.closeDoor();
		door01.lock();
		door01.unlock();
		door01.fireProof();*/
		
		/**
		 * 使用多态的方式初始化对象
		 * */
		//初始化一个对象，将对象赋值给父类类型
		SecurityDoor face1=new SecurityDoor();//接口也可可以看成一个特殊的父类
		//调用方法
		face1.lock();
		face1.unlock();
		Door  door=(Door)face1;
		door.closeDoor();
		door.openDoor();
		
		
		//调用开锁关锁   
		methodA(face1);
		methodB(face1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
