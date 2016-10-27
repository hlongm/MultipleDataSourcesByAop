package com.dewell.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dewell.entity.OrderInfo;
import com.dewell.mapper.OrderInfoMapper;
import com.dewell.service.OrderInfoService;

@Service("orderInfoService")
public class OrderInfoServiceImpl implements OrderInfoService{
	
	@Resource
	private OrderInfoMapper orderInfoMapper;
	public List<OrderInfo> selectAll() {
		List<OrderInfo> orderInfos = orderInfoMapper.selectAll();
		if(orderInfos!=null&&!orderInfos.isEmpty()){
			return orderInfos;
		}
		return null;
	}

}
