package day09;

/**
 * ����̳���Person
 *    
 *    
 *    super ���Է��ʸ������Ժͷ���
 *    superֻ�ܴ�������ķ�����
 *    super���Դ���
 * */
public class Employee extends Person{

	//����
	String hireDate;//��ְʱ��
	
	//��Ϊ
	public void sleep(){
		System.out.println("����˯��");
	}
	
	
	public Employee() {
		super();
	}
	
//	public Employee() {
//		super();
//	}

	public Employee(String hireDate) {
		super();
		this.hireDate = hireDate;
	}

}
