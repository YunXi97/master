package day10;

/**
 * ����˵��:
            ������ˣ�������ҪΪ����ιʳ��ʹ�ö�̬ʵ�ָù���
            ��ͬ����ԵĶ�����һ��
            ��ͬ������궫����ָ�����ֵ��һ��
             ����ֵ�ﵽ100ʱ������Ҫ����ιʳ
 * 
 * */
public class Master {
	public void eat(Pet p){
		 if(p instanceof Dog){
			 //ǿ������ת��
			 Dog dog =(Dog)p;
			 dog.doEat();
		}else if(p instanceof Penguin){
			//ǿ������ת�� 
			Penguin p1=(Penguin)p; 
			//ִ��������������
			p1.doEat();
		}
}
	

	public static void main(String[] args) {
		Master m=new Master();
		Dog dog=new Dog(100);
		Pet p1=dog;
		m.eat(p1);
		
		Penguin pen=new Penguin(30);
		Pet p2=pen;
		m.eat(p2);

	}

}
