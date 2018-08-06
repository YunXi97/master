package day14.enums;

/**
 * ����һ��ö����
 * 
 * */
enum Weekday{
	/**
	 * Ĭ�ϼ̳�java.lang.enum
	 *   
	 * ʹ�ù�����ֻ����������
	 * �������֮���ö��Ÿ���
	 * ����������ڵ�һ��
	 * ��������������������  ���ǵ�ǰö�����͵Ķ���
	 * */
	MON,TUES,WEDNES,THURS,FRI,SATUR,SUN;
	
	//ö�����ڲ������������ֶ� ���� ���췽�� �ڲ��࣬������ڳ���֮��
	int age;
	public void methodA(){
		System.out.println("��ש");
	}
	
	//���췽��  ����˽��
	private Weekday(){}
	private Weekday(String name){}
}


public class Employee {
	//����
	private Weekday restDay;

	public Weekday getRestDay() {
		return restDay;
	}

	public void setRestDay(Weekday restDay) {
		this.restDay = restDay;
	}

	//�ж��Ƿ�����Ϣ��
	public void weekend(){
		switch(this.restDay){
		case MON:
		case TUES:
		case WEDNES:
		case THURS:
		case FRI:
		case SATUR:
			System.out.println("��ש��");
			break;
		case SUN:
			System.out.println("��Ϣ��");
		}
		
	}
	
	
	public static void main(String[] args) {
		//��ʼ��һ������
		Employee em=new Employee();
		em.setRestDay(Weekday.MON);
		em.weekend();
		
		//��ȡö�ٶ��������
		String name=Weekday.SUN.name();
		System.out.println(name);
		//��ȡö�����͵�����
		name=Weekday.FRI.toString();
		System.out.println(name);
		//��ȡö�ٶ���  ���������к�
		int index=Weekday.MON.ordinal();
		System.out.println(index);
		//��ȡ����ö�ٳ���  ����һ������
		Weekday[]arr=Weekday.values();
		for(Weekday wd:arr){
			System.out.println(wd);
		}
		//��String����ת��Ϊö�ٳ���   Ҫ��String���Ʊ����ö�����ͳ�����һ��
		Weekday w=Weekday.valueOf("TUES");
		System.out.println(w);
		
		
		
		
		
		
		
		
		
		
		
	}

}
