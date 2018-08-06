package day12;

public class Test {

	public static void main(String[] args) {
		//初始化一个Stack对象
		Stack s=new Stack();
		
		//初始化User对象
		User u1=new User("张三",20);
		User u2=new User("李四",21);
		User u3=new User("王五",22);
		User u4=new User("赵六",23);
		User u5=new User("田七",24);
		
		try{
			//压栈
			s.push(u1);
			s.push(u2);
			s.push(u3);
			s.push(u4);
			s.push(u5);
			
			s.push(u5);
		}catch(StackOperationException e){
			e.printStackTrace();
		}
		
		try{
			//弹栈
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			
			System.out.println(s.pop());
		}catch(StackOperationException e){
			e.printStackTrace();
		}
		
	}

}

class User{
	String name;
	int age;
	User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User[name="+name+",age="+age+"]";
	}
	
}
