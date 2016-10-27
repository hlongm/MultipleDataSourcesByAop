package com.dewell.mapper;

import java.util.List;

import com.dewell.datasource.DataSourceTwo;
import com.dewell.entity.User;

public interface UserMapper extends DataSourceTwo{
	public List<User> selectAll();
}
