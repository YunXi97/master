package day09;

public class TestDemo {
	public static void main(String[] args) {
		//��ڷ���
		//��ʼ��һ��Student����  ��������и�ֵ
		Student stu=new Student();
		stu.sid="32432";
		stu.name="����";
		stu.age=13;
		stu.sleep();
		
		//��ʼ��һ��Teacher����  ��������и�ֵ
		Teacher th=new Teacher();
		th.level=5;
		th.name="����";
		th.age=13;
		th.sleep();
		
		//��ʼ��һ��Employee����  ��������и�ֵ
		Employee em=new Employee();
		em.hireDate="32432";
		em.name="����";
		em.age=13;
		em.sleep();
	}

}
