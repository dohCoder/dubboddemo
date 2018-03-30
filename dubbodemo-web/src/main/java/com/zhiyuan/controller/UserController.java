package com.zhiyuan.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyuan.client.UserServiceClient;
import com.zhiyuan.domain.User;

@Controller  
public class UserController {  
      
    @Autowired  
    private UserServiceClient userService;   
     @RequestMapping(value = "/list", method = RequestMethod.GET)  
    public ModelAndView list(Model model) {  
    	 ModelAndView mv = new ModelAndView();
        //获取列表页
    	 ArrayList<User> list = (ArrayList<User>) userService.getListUser();  
        mv.addObject("list", list); 
        mv.setViewName("list");
        //list.jsp + model = ModelAndView  
        return mv;// /WEB-INF/jsp/"list".jsp  
    }  
      
}  
