package cn.jsmoon.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.jsmoon.dao.UserDao;
import cn.jsmoon.model.User;
import cn.jsmoon.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}
