package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//@Service //를 하게 되면 printLog before point cut이 두번 실행됨 왜인지 아직 모르겠다....
//@Aspect				
public class LogAdvice {
//
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//com.springbook.biz..에서 Impl로 끝나는 객체 사용시 aop 동작
//	public void allPointcut() {}
//	
//	@Before("allPointcut()")
	public void printLog() {
		System.out.println("공통 로그 비지스 로직 수행 전 동작 LogAdvice");
		
	}
}
