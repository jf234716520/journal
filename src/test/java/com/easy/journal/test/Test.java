package com.easy.journal.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.easy.journal.common.model.User;
import com.easy.journal.common.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {
	
	
	    @Autowired
	    private UserService userService;
	    @org.junit.Test
	    public void test1() {
	    	User u = userService.getUserByUUID("1");
	    	System.out.println(u.getName());
	    	//return a+3;
	    }
	    
	    public int sum(int var1, int var2) {
			System.out.println("相加的值是: " + var1 + " + " + var2);
			return var1 + var2;
		}
	
}
