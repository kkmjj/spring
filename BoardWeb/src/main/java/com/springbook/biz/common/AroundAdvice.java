package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//around 함수는 ProceedingJoinPoint객체를 매개변수로 받아야한다. 
public class AroundAdvice {

	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable
	{
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		System.out.println("arround 수행 전--------------------------------------------------  ");
		Object returnObj = pjp.proceed();
		System.out.println("arround 수행후----------------------------------------------------");
		
		stopwatch.stop();
		System.out.println("이 비지니스의 걸린 시간은"+stopwatch.getTotalTimeMillis());
		
		
		
		
		return returnObj;
	}
	
	
}
