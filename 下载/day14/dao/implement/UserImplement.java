package day14.dao.implement;

import day14.dao.UserInterface;

public class UserImplement implements UserInterface{
  //所有用户功能的实现在这里 操作数据库
	
	@Override
	public void register(String name, String pwd) {
		//注册查询数据库的代码
	}
	@Override
	public boolean login(String name, String pwd) {
		// 登录数据库的代码在这里
		return false;
	}
	@Override
	public boolean rePassword(String name, String oldPwd, String newPwd) {
		// 修改密码
		return false;
	}
	@Override
	public boolean editPersonInfo(String uid, String nickName) {
		// 编辑个人中心
		return false;
	}
	
	
}
