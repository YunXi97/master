package day15.random;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomTest {

	public static void main(String[] args) {
		// ThreadLocalRandom ֧�ֶ��߳�
		//ͨ����ǰ�̻߳�ȡһ��random����
		ThreadLocalRandom rand=ThreadLocalRandom.current();
		//���Ե���random����
		System.out.println(rand.nextDouble(10.0, 20.0));
		System.out.println(rand.nextInt(10, 20));

	}

}
