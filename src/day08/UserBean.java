package day08;

/**
 * JavaBean 可重用的组件
 *   1.属性私有化
 *   2.公开属性设置和获取方法
 *   3.必须有一个无参构造方法，如果有有参构造方法，需要写一个无参构造方法
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
		//this 代表当前对象，哪个对象调用该方法 ，this就代表谁，this.name代表对象的属性
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//公开getter方法   get后跟上属性的单词，单词的首字母要大写
	//如果是boolean类型不能使用get 要使用is
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

}
