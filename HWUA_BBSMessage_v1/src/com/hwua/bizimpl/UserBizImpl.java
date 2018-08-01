package com.hwua.bizimpl;

import com.hwua.bin.User;
import com.hwua.biz.UserBiz;
import com.hwua.dao.UserDao;
import com.hwua.daoimpl.UserDaoImpl;


public class UserBizImpl implements UserBiz{
	UserDao mUserDaoImpl = new UserDaoImpl();
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return mUserDaoImpl.addUser(user);
	}

}
