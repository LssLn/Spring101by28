package com.example.helloWorldAPI.AOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.example.helloWorldAPI.AOP.business_dao.*.*(..))")
	public void businessLayerExecution(){}
}
