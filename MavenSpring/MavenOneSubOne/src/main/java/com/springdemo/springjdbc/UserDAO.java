package com.springdemo.springjdbc;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = new JdbcTemplate();
	}
	
	public void setJdbcTemplateDS(DataSource ds) {
		this.jdbcTemplate=new JdbcTemplate(ds);
	}
	public User findUserById(int id){
		String str="select * from test1.user where USER_ID=?";
		User user=(User) jdbcTemplate.queryForObject(str, new Object[]{id},new UserMapper());
		return user;
	}
}
