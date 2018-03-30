package com.zhiyuan.clientimpl.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhiyuan.domain.User;
@Repository
public interface UserDao {
	public List<User> getListUser(); 
}
