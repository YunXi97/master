package day08;


public class Test01 {

	//private �ֶ�  ����
	//��ͬ���п��Է���
	private String name;//����
	public void study(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Test01 t=new Test01();
		t.name="jihgf";
		t.study();

	}

}
class TestDemo{
	public void method(){
		//��ʼ��һ����
		Test01 t1=new Test01();
	}
}
