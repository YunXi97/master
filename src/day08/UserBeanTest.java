package day08;

public class UserBeanTest {

	public static void main(String[] args) {
		//��ʼ��һ��JavaBean����
		UserBean user=new UserBean();
		//����һ��setter����
		user.setName("����");
		user.setAge(13);
		user.setSex(true);
		//ȡ������ֵ
		System.out.println(user.getName()+" "+user.getAge()+" "+user.isSex());

	}

}
