package com.zhiyuan.clientimpl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyuan.client.UserServiceClient;
import com.zhiyuan.clientimpl.dao.UserDao;
import com.zhiyuan.domain.User;
@Service("userServiceClientImpl")
public class UserServiceClientImpl implements UserServiceClient {

	//注入Service依赖  
    @Autowired  
    private UserDao userDao;  
  
    /** 
     * @return 
     * @see com.UserServiceClient.service.UserService#getListUser() 
     *<pre> 
     *<li>Author:</li> 
     *<li>Date: 2016年9月23日</li> 
     *</pre> 
     */  
    @Override  
    public List<User> getListUser() {  
        return userDao.getListUser();  
    }  
}
