package day13;
/**
 * ������
 *    �����ŵ��ص�
 *    �������Ĺ���
 *    
 *    
 *    
 * ʵ����
 *    �����Ҫʵ��ĳһ���ӿ��﷨
 *    ���η� class ����  extends ����  implement �ӿ�1,�ӿ�2,...{
 *    	//������д�ӿ��еķ���
 *    } 
 * */
public class SecurityDoor extends Door implements FirstInterface,SecondInterface{
	@Override
	public void lock() {
		System.out.println("ָ������");
		
	}
	@Override
	public void unlock() {
		System.out.println("ָ�ƽ���");
	}
	
	@Override
	public void fireProof() {
		System.out.println("��ɷ�  �Զ�����");
		
	}
	

}
