package day09;

//������
public class Animal {
	//����
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//����
	public void sleep(){
		System.out.println("����˯��");
	}
	public void eat(){
		System.out.println("����Զ���");
	}
	
	//���췽��
	public Animal(String name,int age) {
		System.out.println("����������Ĺ��췽��");
		this.name = name;
		this.age=age;
	}
	public Animal() {
		System.out.println("������Ĭ�Ϲ��췽��");
	}

}
