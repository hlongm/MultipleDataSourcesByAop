package com.dewell.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.dewell.datasource.DataSourceOne;
import com.dewell.datasource.DataSourceTwo;

@Component
@Aspect
public class MultipleDataSourceAspectAdvice {
	
	@Around("execution(* com.dewell.mapper.*.*(..))")
	public Object doAround(ProceedingJoinPoint jp) throws Throwable{
		if (jp.getTarget() instanceof DataSourceOne) {
            MultipleDataSource.setDataSourceKey("dataSource1");
        } else if (jp.getTarget() instanceof DataSourceTwo) {
            MultipleDataSource.setDataSourceKey("dataSource2");
        }
		return jp.proceed();
	}
}
