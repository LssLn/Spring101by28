package com.example.helloWorldAPI.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@AfterReturning(value = "execution(* PACKAGE.*.*(..))",
//	@AfterReturning(value = "execution(* com.example.helloWorldAPI.AOP.business_dao.*.*(..))",
//			returning = "result")
	@AfterReturning(value = "com.example.helloWorldAPI.AOP.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
//	@After(value = "execution(* PACKAGE.*.*(..))")
//	@After(value = "execution(* com.example.helloWorldAPI.AOP.business_dao.*.*(..))")
	@After(value = "com.example.helloWorldAPI.AOP.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint);
	}
	
//	@AfterThrowing(value = "execution(* PACKAGE.*.*(..))",
//	@AfterThrowing(value = "execution(* com.example.helloWorldAPI.AOP.business_dao.*.*(..))",
//			throwing = "exception")
	@AfterThrowing(value = "com.example.helloWorldAPI.AOP.aspect.CommonJoinPointConfig.businessLayerExecution()",
	throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Exception exception) {
		logger.info("{} threw exception {}", joinPoint, exception);
	}
}
