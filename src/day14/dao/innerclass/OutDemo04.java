package day14.dao.innerclass;

//����һ���ӿ�
interface MyInterface{
	public void sendMsg(String msg);
	static class in{}//����һ��Ĭ�ϵľ�̬�ڲ���
}


public class OutDemo04 {
	public static void methodC(MyInterface face){
		face.sendMsg("Hello World");
	}
	/**
	 * �����ڲ��ࣺ��ǰ�����û������
	 * λ�ã�������
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		//������һ����������   ������ֲ�֪�����������ʵ���˽ӿ�
		MyInterface face=new MyInterface() {
			
			@Override
			public void sendMsg(String msg) {
				System.out.println(msg);
			}
		};
		
		methodC(face);

	}

}
