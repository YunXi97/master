package day09;

/**
 * 需求说明
 *    重写比较规则，判断两名学员（Student）是否为同一对象
 *    Student相关属性：Id（学号）、name（姓名）、age（年龄）
 *    如果两名学员的学号以及姓名相同，则为同一对象
 * 
 * */
public class CompareTest{
	public static void main(String[] args) {
		//初始化一个Student01对象
		Student01 stu1=new Student01();
		stu1.setId("123");
		stu1.setName("张三");
		
		Student01 stu2=new Student01();
		stu2.setId("123");
		stu2.setName("张三");
		
		//使用重写的equals方法比较stu与stu1是否为同一对象
		if(stu1.equals(stu2)){
			System.out.println(stu1+"是同一对象"+stu2);
		}else System.out.println(stu1+"不是同一对象"+stu2);
	}
}

 
