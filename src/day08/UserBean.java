package day08;

/**
 * JavaBean �����õ����
 *   1.����˽�л�
 *   2.�����������úͻ�ȡ����
 *   3.������һ���޲ι��췽����������вι��췽������Ҫдһ���޲ι��췽��
 * 
 * 
 * 
 */
public class UserBean {
	private String name;
	private int age;
	private boolean sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//this ����ǰ�����ĸ�������ø÷��� ��this�ʹ���˭��this.name������������
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//����getter����   get��������Եĵ��ʣ����ʵ�����ĸҪ��д
	//�����boolean���Ͳ���ʹ��get Ҫʹ��is
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

}
