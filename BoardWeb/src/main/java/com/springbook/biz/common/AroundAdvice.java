package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//around �Լ��� ProceedingJoinPoint��ü�� �Ű������� �޾ƾ��Ѵ�. 
public class AroundAdvice {

	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable
	{
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		System.out.println("arround ���� ��--------------------------------------------------  ");
		Object returnObj = pjp.proceed();
		System.out.println("arround ������----------------------------------------------------");
		
		stopwatch.stop();
		System.out.println("�� �����Ͻ��� �ɸ� �ð���"+stopwatch.getTotalTimeMillis());
		
		
		
		
		return returnObj;
	}
	
	
}
