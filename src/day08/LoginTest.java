package day08;

public class LoginTest {
    //入口方法
	public static void main(String[] args) {
		//初始化一个Login对象
		Login demo=new Login();
		//调用登录方法 
		String msg=demo.login("mars12345", "123456");
		System.out.println(msg);

	}

}
class Login{
	//属性
	//行为  实现登录功能
	private boolean isOk(String str){
		if(str.length()>=6&&str.length()<=12){
			return true;
		}else
			return false;
	}
	
	public String login(String userName,String pwd){
		//判断用户名是否合法   6-12位
		if(!isOk(userName))
			return "用户不合法";
		//判断密码是否合法   6-12位
		if(!isOk(pwd))
			return "请输入合法的密码";
		//判断是否登录成功
		if(userName.equals("mars12345")&&pwd.equals("123456")){
			return "登录成功";
		}
		return "用户名或密码错误";
	}
}
