package day14.dao.innerclass;

public class OutDemo02 {
	String name;//ʵ����Ա
	static int number;
	//�ⲿ��ķ���
	public void methodA(){
		System.out.println("���"+name);
	}
	public static void methodB(){
		System.out.println("�ⲿ�ྲ̬����");
	}
	
	/**
	 * ��̬�ڲ���
	 *    λ�ã�����  �����ⲿ
	 *    ���Σ�final abstract static private public protect
	 *    ��Ա����̬  �Ǿ�̬
	 * 
	 * */
	static class Inner01{
		String name;
		static int age;
		public Inner01(){
			System.out.println("��̬�ڲ��๹�췽��");
		}
		
		public void methodA(){
			System.out.println("��̬�ڲ����ʵ����Ա");
			number=234;
			name="����";//��������ڲ����Ա
			//OutDemo02.this.name="fre";//����������ⲿ��ʵ����Ա
		}
		public static void methodB(){
			System.out.println("��̬�ڲ���ľ�̬��Ա");
		}
		
		
	}

	

	public static void main(String[] args) {
		OutDemo02.Inner01 in=new OutDemo02.Inner01();
		//�����ڲ����Ա  ���Է������г�Ա 
		in.methodA();
		in.methodB();
		
		//ֱ�ӷ����ڲ���ľ�̬��Ա  ����������
		Inner01.age=12;
		Inner01.methodB();

	}

}
