package day15.random;

import java.util.Random;

/**
 * random ����һ��α�����  ��Ҫ����������
 *    ���ͣ� boolean  true|false
 *         double   [0.0,1.0)
 *         float    [0.0,1.0)
 *         int      �����ķ�Χ
 *         long     long���͵ķ�Χ
 * 
 * */
public class RandomTest {
	
	public static void main(String[] args) {
		// ��ʼ��һ�����������
		//Random rand=new Random();//Ĭ���Ե�ǰʱ����Ϊ����
		Random rand=new Random(3);//�̶���ǰʱ��
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(10));//[0,10)
		
		//����[10,20)�������  int
		System.out.println(rand.nextInt(10)+10);
		//Math.random();  <===>  rand.nextDouble();

	}

}
