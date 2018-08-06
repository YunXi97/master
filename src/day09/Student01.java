package day09;

public class Student01 {
	//属性
	private String id;//学号
	private String name;//姓名
	private int age;//年龄
	
	//getter and setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public Student01(String id, String name, int age) {
		super();//super只能放在构造方法的第一行
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student01() {
		super();
	}
	
	//重写equals方法
	@Override
	public boolean equals(Object obj) {
		//判断obj是否属于Student01类
		if(obj instanceof Student01){
			//将obj强制转换为Student01类型
			Student01 s=(Student01)obj;
			if(this.name==s.getName()&&this.id==s.getId()){
				return true;
			}else return false;
		}
		return super.equals(obj);//super可以放在实例方法的任意一行
	}
	

}
