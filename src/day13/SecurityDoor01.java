package day13;
/**
 * ʵ����
 * 
 * */
public class SecurityDoor01 extends Door implements FirstInterface,SecondInterface{
	@Override
	public void lock() {
		System.out.println("��Ĥʶ������");
		
	}
	@Override
	public void unlock() {
		System.out.println("��Ĥ����");
		
	}
	
	@Override
	public void fireProof() {
		System.out.println("�Զ�����   �Զ���ˮ");
		
	}

}
