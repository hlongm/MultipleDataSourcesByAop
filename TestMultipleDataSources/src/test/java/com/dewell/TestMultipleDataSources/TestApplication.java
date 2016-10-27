package com.dewell.TestMultipleDataSources;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.dewell.entity.OrderInfo;
import com.dewell.entity.User;
import com.dewell.service.OrderInfoService;
import com.dewell.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring_application.xml" })
public class TestApplication {
	
	@Resource
	private OrderInfoService orderInfoService;
	@Resource
	private UserService userService;

	@Test
	public void test() {
		List<OrderInfo> orderInfos = orderInfoService.selectAll();
		System.out.println(JSON.toJSON(orderInfos));
		
		List<User> users = userService.selectAll();
		System.out.println(JSON.toJSON(users));
		//fail("Not yet implemented");
	}

}
