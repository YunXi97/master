package day14.dao;
//定义个人中心的功能
public interface UserInterface {
	
	/**
	 * 注册功能
	 * */
	public void register(String name,String pwd);
	
	/**
	 * 用户登录
	 * */
	public boolean login(String name,String pwd); 

	/**
	 * 修改密码
	 *    name    用户名
	 *    oldPwd  旧密码
	 *    newPwd  新密码
	 * */
	public boolean rePassword(String name,String oldPwd,String newPwd);
	
	/**
	 * 修改用户名 
	 *     uid        用户id
	 *     nickName   匿名
	 * */
	public boolean editPersonInfo(String uid,String nickName);
}
