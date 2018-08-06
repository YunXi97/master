package day15.string;

public class StringTest01 {

	public static void main(String[] args) {
		//创建字符串的两种方式
		String str="ABCD";//字面量
		//通过构造方法创建一个对象
		String str1=new String("ABCD");
		String str2="ABC";
		//合并字符串  堆中分配内存
		String str3=str2+"D";
		//
		String str4="AB"+"CD";
		
		//String 主要分配内存在两个地方  1.堆区  2.常量池
		//常量池  存储的是常量，虚拟机在变异的时候已经将这些数据存储在常量池中
		//堆区：new String的引用  拼接新的字符串
		
		//字符串进行比较的时候  == 比较的是引用地址
		if(str==str4){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
	
		//equals 比较的是字面值是否相等  不比内存
		if(str.equals(str3)){
			System.out.println("字面相等");
		}
		
		//判断一个字符是否等于常量，一定要用常量和变量进行比较
		String str5=null;
		//if(str5.equals("123")){}
		
		//判断地址是否为空
		if(str5==null){
			System.out.println("地址为空");
		}
		//判断内容是否为空
		if("".equals(str5))
			System.out.println("内容为空");
		else
			System.out.println("不为空");
		
		
		
		
		System.out.println(str);
		System.out.println(str1);

	}

}
