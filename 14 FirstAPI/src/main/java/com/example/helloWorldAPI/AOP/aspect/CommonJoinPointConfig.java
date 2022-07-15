package com.example.helloWorldAPI.AOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.example.helloWorldAPI.AOP.business_dao.*.*(..))")
	public void businessLayerExecution(){}
	
	//all the method calls on beans containing "dao" in the name are matched by the Pointcut
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}
	
	//all the method calls on beans starting with "dao" in the name are matched by the Pointcut
	@Pointcut("bean(dao*)")
	public void beanStartingDao(){}
	
	//all the method calls on beans ending on "dao" in the name are matched by the Pointcut
	@Pointcut("bean(*dao)")
	public void beanEndingDao(){}
}
