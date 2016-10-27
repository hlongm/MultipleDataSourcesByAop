package com.dewell.mapper;

import java.util.List;

import com.dewell.datasource.DataSourceOne;
import com.dewell.entity.OrderInfo;

public interface OrderInfoMapper extends DataSourceOne{
	
	public List<OrderInfo> selectAll(); 
}
