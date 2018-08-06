package day15.random;

import java.util.Random;

/**
 * random 生成一个伪随机数  主要依靠于种子
 *    类型： boolean  true|false
 *         double   [0.0,1.0)
 *         float    [0.0,1.0)
 *         int      整数的范围
 *         long     long类型的范围
 * 
 * */
public class RandomTest {
	
	public static void main(String[] args) {
		// 初始化一个随机数对象
		//Random rand=new Random();//默认以当前时间作为种子
		Random rand=new Random(3);//固定当前时间
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(10));//[0,10)
		
		//生成[10,20)的随机数  int
		System.out.println(rand.nextInt(10)+10);
		//Math.random();  <===>  rand.nextDouble();

	}

}
