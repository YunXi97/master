package day13;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[]arr={"����","��ѧ","Ӣ��"};
		System.out.println("������1 2 3ѡ��γ�");
		int a=input.nextInt();
		try{			
			System.out.println(arr[a]);
		}catch(Exception e){
			System.out.println("�������");
		}finally{
			System.out.println("��ӭ�������");
		}

		input.close();
	}

}
