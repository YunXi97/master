package day09;

/**
 * ����˵��
 *    ��д�ȽϹ����ж�����ѧԱ��Student���Ƿ�Ϊͬһ����
 *    Student������ԣ�Id��ѧ�ţ���name����������age�����䣩
 *    �������ѧԱ��ѧ���Լ�������ͬ����Ϊͬһ����
 * 
 * */
public class CompareTest{
	public static void main(String[] args) {
		//��ʼ��һ��Student01����
		Student01 stu1=new Student01();
		stu1.setId("123");
		stu1.setName("����");
		
		Student01 stu2=new Student01();
		stu2.setId("123");
		stu2.setName("����");
		
		//ʹ����д��equals�����Ƚ�stu��stu1�Ƿ�Ϊͬһ����
		if(stu1.equals(stu2)){
			System.out.println(stu1+"��ͬһ����"+stu2);
		}else System.out.println(stu1+"����ͬһ����"+stu2);
	}
}

 
