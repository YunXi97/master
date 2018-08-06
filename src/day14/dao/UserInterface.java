package day14.dao;
//����������ĵĹ���
public interface UserInterface {
	
	/**
	 * ע�Ṧ��
	 * */
	public void register(String name,String pwd);
	
	/**
	 * �û���¼
	 * */
	public boolean login(String name,String pwd); 

	/**
	 * �޸�����
	 *    name    �û���
	 *    oldPwd  ������
	 *    newPwd  ������
	 * */
	public boolean rePassword(String name,String oldPwd,String newPwd);
	
	/**
	 * �޸��û��� 
	 *     uid        �û�id
	 *     nickName   ����
	 * */
	public boolean editPersonInfo(String uid,String nickName);
}
