package com.example.helloWorldAPI.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP Configuration
@Aspect
@Configuration
public class BeforeAspect {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	// @Before("execution PACKAGE.*.*(..)) ")
	@Before("execution(* com.example.helloWorldAPI.AOP.business_dao.*.*(..)) ")
	public void before(JoinPoint joinPoint) {
		logger.info("Method call intercepted {}", joinPoint);
	}
}
