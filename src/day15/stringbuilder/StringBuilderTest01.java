package day15.stringbuilder;

/**
 * StringBuilder 
 *   1.可变字符串，内容改变，引用地址不变
 *   2.StringBuilder线程不安全，不支持同步，读写速度快，一般不考虑线程安全的情况下尽可能使用该类
 *   3.该类和StringBuffer功能方法一样，唯一区别：StringBuffer线程安全，支持线程同步，性能较低
 * 
 * */
public class StringBuilderTest01 {

	public static void main(String[] args) {
		//初始化一个StringBuilder对象   空字符序列
		StringBuilder str=new StringBuilder();
		//在尾部追加字符
		str.append(true);//将boolean类型转换成String类型  引用地址不变
		System.out.println(str);
		str.append('你');//追加char类型
		System.out.println(str);
		str.append(3.4);
		System.out.println(str);
		str.append(new Object());//追加一个对象
		System.out.println(str);
		char[]c={'张','三','李','四'};
		str.append(c);
		System.out.println(str);
		str.append(c, 1, 3);//追加一个数组  从数组下标位置开始--长度
		System.out.println(str);
		str.append("喜欢您说的",1,2);//从0开始截取字符--结束下标[1,2)
		System.out.println(str);
		
		//指定位置插入数据
		str.insert(1, 'f');
		System.out.println(str);
		str.insert(3,"王五");
		System.out.println(str);
		
		//替换  从指定位置开始到某个位置结束  替换指定字符串 [起始位置,结束位置)
		str.replace(3, 5, "赵六");
		System.out.println(str);
		
		//查询
		String s=str.substring(10);//从字符序列下标位置一直截取到最后，返回一个String类型
		System.out.println(s);
		s=str.substring(0, 3);//[0,3)
		System.out.println(s);
		//查询指定索引位置的字符
		char cc=str.charAt(0);
		System.out.println(cc);
		//查询指定字符  首次出现的索引位置
		int index=str.indexOf("张三");
		System.out.println(index);
		//最后一次出现的位置
		index=str.lastIndexOf("李四");
		System.out.println(index);
		
		//删除指定字符
		str.delete(0, 5);//[0,5)
		System.out.println(str);
		str.deleteCharAt(1);//删除指定位置的字符
		System.out.println(str);
		
		//反转字符
		str.reverse();
		System.out.println(str);
		
		
		
		
		
		
		
		

	}

}
