package day14.dao.implement;

import day14.dao.UserInterface;

//所有用户功能的实现   操作数据库
public class UserImplement implements UserInterface{

	@Override
	public void register(String name, String pwd) {
		//注册查询数据库的代码

	}

	@Override
	public boolean login(String name, String pwd) {
		// 登录数据库
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
