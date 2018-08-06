package day13.test02;


public class InterfaceTest01 {
	
	public static void shape(Shape s){
		
		if(s instanceof Rectangle){
			System.out.println("�þ������Ϊ��"+s.area());
			System.out.println("�þ����ܳ�Ϊ��"+s.perimeter());
		}
		if(s instanceof Circle){
			System.out.println("��Բ���Ϊ��"+s.area());
			System.out.println("��Բ�ܳ�Ϊ��"+s.perimeter());
		}
	}
	
	public static void main(String[] args) {
		//��ʼ��һ������
		Rectangle r=new Rectangle(4,6);
		//��ͼ��������ܳ�
		shape(r);
		//��ʼ��һ��Բ
		Circle c=new Circle(4);
		//��ͼ��������ܳ�
		shape(c);
		
	}
}
