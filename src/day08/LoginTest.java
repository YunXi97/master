package day08;

public class LoginTest {
    //��ڷ���
	public static void main(String[] args) {
		//��ʼ��һ��Login����
		Login demo=new Login();
		//���õ�¼���� 
		String msg=demo.login("mars12345", "123456");
		System.out.println(msg);

	}

}
class Login{
	//����
	//��Ϊ  ʵ�ֵ�¼����
	private boolean isOk(String str){
		if(str.length()>=6&&str.length()<=12){
			return true;
		}else
			return false;
	}
	
	public String login(String userName,String pwd){
		//�ж��û����Ƿ�Ϸ�   6-12λ
		if(!isOk(userName))
			return "�û����Ϸ�";
		//�ж������Ƿ�Ϸ�   6-12λ
		if(!isOk(pwd))
			return "������Ϸ�������";
		//�ж��Ƿ��¼�ɹ�
		if(userName.equals("mars12345")&&pwd.equals("123456")){
			return "��¼�ɹ�";
		}
		return "�û������������";
	}
}
