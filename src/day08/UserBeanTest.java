package day08;

public class UserBeanTest {

	public static void main(String[] args) {
		//初始化一个JavaBean对象
		UserBean user=new UserBean();
		//调用一个setter方法
		user.setName("张三");
		user.setAge(13);
		user.setSex(true);
		//取出所有值
		System.out.println(user.getName()+" "+user.getAge()+" "+user.isSex());

	}

}
