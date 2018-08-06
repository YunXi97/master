package day14.dao.innerclass;

/**
 * �ڲ��ࣺ
 *    ������ڲ�����һ���࣬���Կ�����ĳ�Ա
 * ��ĳ�Ա��
 *    �ֶΣ���������
 * �ڲ������ͣ�
 *    1.ʵ���ڲ���
 *    2.��̬�ڲ���
 *    3.�ֲ��ڲ���
 *    4.�����ڲ���  
 * 
 * 
 * */
public class OutDemo01 {

	//�ⲿ�������
	String name;//ʵ����Ա
	static int age;
	//�ⲿ��ķ���
	public void methodA(){
		System.out.println("���"+name);
	}

	 /**
	  * ʵ���ڲ���
	  *   λ�ã� ���� ������
	  *   ���η���public private  protected
	  *   ������static
	  *    
	  *    ���ж���ĳ�Ա
	  *    ����ʹ��static��������
	  *    ����Ȩ�����η� ������
	  *       
	  *    //�ڲ�������ⲿ��ĳ�Ա   
	  *       ���ڲ����п���ֱ�ӷ����ⲿ��ĳ�Ա(ʵ���;�̬)
	  *       
	  *    
	  */
	class Inner{
		//�����ڲ���ĳ�Ա
		String name;//ʵ����Ա
		//static int number;//����ʹ��static��������
		public void methodB(){
			System.out.println("ʵ���ڲ���ķ���"+name+age);
			OutDemo01.this.methodA();
		}
		
		public void methodC(){
			//����ⲿ���Ա���ڲ����Աһ�£�Ĭ�Ϸ��ʵ����ڲ���ĳ�Ա
			//�����ⲿ���Ա
			System.out.println(OutDemo01.this.name);
			//�����ⲿ���methodA����
			OutDemo01.this.methodA();
		}
		
		public void methodA(){
			System.out.println("�ڲ��෽��");
		}
		
		public Inner(){
			System.out.println("�ڲ��๹�췽��");
		}
		
	}



	public static void main(String[] args) {
		//��ʼ��һ���ⲿ��
		OutDemo01 out=new OutDemo01();
		//���ⲿ�����Խ��и�ֵ
		out.name="����";
		out.methodA();
		age=13;
		
		//��ʼ��һ���ڲ������
		Inner inner=out.new Inner();
		
		//���ڲ������Ը�ֵ
		inner.name="����";
		//�����ڲ��෽��
		inner.methodA();
		inner.methodB();
		inner.methodC();


	}

}
