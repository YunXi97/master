package day13;

public class InterfaceTest01 {
	//ʵ�ֵ���FirstInterface����
	public static void methodA(FirstInterface face){
		face.lock();
		face.unlock();
	}
	
	//����SecondInterface����
	public static void methodB(SecondInterface face){
		face.fireProof();
	}

	public static void main(String[] args) {
	/*	//��ʼ��һ����ȫ��
		SecurityDoor door=new SecurityDoor();
		//���÷���
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
		 * ʹ�ö�̬�ķ�ʽ��ʼ������
		 * */
		//��ʼ��һ�����󣬽�����ֵ����������
		SecurityDoor face1=new SecurityDoor();//�ӿ�Ҳ�ɿ��Կ���һ������ĸ���
		//���÷���
		face1.lock();
		face1.unlock();
		Door  door=(Door)face1;
		door.closeDoor();
		door.openDoor();
		
		
		//���ÿ�������   
		methodA(face1);
		methodB(face1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
