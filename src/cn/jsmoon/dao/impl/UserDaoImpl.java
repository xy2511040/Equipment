package cn.jsmoon.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import cn.jsmoon.dao.UserDao;
import cn.jsmoon.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Resource
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User login(User user) {
		String sql="select * from t_user where userName=? and password=?";
		final User resultUser=new User();
		jdbcTemplate.query(sql, new Object[] {user.getUserName(),user.getPassword()}, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				resultUser.setId(rs.getInt("id"));
				resultUser.setUserName(rs.getString("userName"));
				resultUser.setPassword(rs.getString("password"));
				resultUser.setRoleName(rs.getString("roleName"));
			}
		});
		return resultUser;
	}

}
