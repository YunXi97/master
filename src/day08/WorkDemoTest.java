package day08;

public class WorkDemoTest {

	public static void main(String[] args) {

		//��3��4������Բ��  ��ԭ��Ϊ���ģ�2Ϊ�뾶����һ��Բ
		WorkDemo wd=new WorkDemo(3,4,2);
		String msg=wd.relationshipFromPoint();
		System.out.println(msg);
		
		//��3��4������Բ��  ��ԭ��Ϊ���ģ�6Ϊ�뾶����һ��Բ
		WorkDemo wd1=new WorkDemo(3,4,6);
		String msg1=wd1.relationshipFromPoint();
		System.out.println(msg1);
		
		//��3��4������Բ��  ��ԭ��Ϊ���ģ�5Ϊ�뾶����һ��Բ
		WorkDemo wd2=new WorkDemo(3,4,5);
		String msg2=wd2.relationshipFromPoint();
		System.out.println(msg2);
	}

}
