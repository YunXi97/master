package day09;

public class Student01 {
	//����
	private String id;//ѧ��
	private String name;//����
	private int age;//����
	
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
		super();//superֻ�ܷ��ڹ��췽���ĵ�һ��
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student01() {
		super();
	}
	
	//��дequals����
	@Override
	public boolean equals(Object obj) {
		//�ж�obj�Ƿ�����Student01��
		if(obj instanceof Student01){
			//��objǿ��ת��ΪStudent01����
			Student01 s=(Student01)obj;
			if(this.name==s.getName()&&this.id==s.getId()){
				return true;
			}else return false;
		}
		return super.equals(obj);//super���Է���ʵ������������һ��
	}
	

}
