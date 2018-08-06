package day15.random;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		// UUID是128位的随机数  保证在同一时空中产生的随机数都是唯一的，随机数用16进制表示
		//获取一个UUID对象
		UUID uid=UUID.randomUUID();
		//将对象转换为String
		String str=uid.toString();
		System.out.println(str);
		
		//去掉-
		String newStr=str.replace("-", "");
		System.out.println(newStr);

	}

}
