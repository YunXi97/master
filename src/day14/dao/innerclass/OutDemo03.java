package day14.dao.innerclass;

public class OutDemo03 {
	//����
	String name;
	static int sex;
	
	public void methodA(){
		System.out.println("�ⲿ���ʵ������");
	}
	/**
	 * �ֲ��ڲ���
	 *    λ�ã�������
	 *    ��Ա�����붼��ʵ����Ա
	 *    ֻ���������ķ�����ʹ��
	 * 
	 * */
	
	public void methodB(){
		
		int num=13;//����
		class Inner02{
			String name;
			int age;
			
			public void methodC(){
				//�ֲ��ڲ�����Է����ⲿ������г�Ա
				System.out.println(sex);
				System.out.println(name);
				//�����ⲿ��  �����ڵľֲ�����
				System.out.println(num);
				//num=24;//�������ɸı�
				
				System.out.println("�ֲ��ڲ����ʵ������");
			}
			
			//public static void methodD(){}
			
		}
		Inner02 in=new Inner02();
		in.name="fafs";
		in.age=42;
		in.methodC();
		
	}
	

	public static void main(String[] args) {
		//��ʼ��һ���ⲿ�����
		OutDemo03 out=new OutDemo03();
		out.methodB();
	

	}

}
