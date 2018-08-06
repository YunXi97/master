package day13;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[]arr={"语文","数学","英语"};
		System.out.println("请输入1 2 3选择课程");
		int a=input.nextInt();
		try{			
			System.out.println(arr[a]);
		}catch(Exception e){
			System.out.println("输入错误！");
		}finally{
			System.out.println("欢迎提出建议");
		}

		input.close();
	}

}
