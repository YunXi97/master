package day15.random;

import java.util.UUID;

public class UUIDTest {

	public static void main(String[] args) {
		// UUID��128λ�������  ��֤��ͬһʱ���в��������������Ψһ�ģ��������16���Ʊ�ʾ
		//��ȡһ��UUID����
		UUID uid=UUID.randomUUID();
		//������ת��ΪString
		String str=uid.toString();
		System.out.println(str);
		
		//ȥ��-
		String newStr=str.replace("-", "");
		System.out.println(newStr);

	}

}
