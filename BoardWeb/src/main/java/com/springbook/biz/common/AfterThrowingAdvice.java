package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


//@Service
//@Aspect
public class AfterThrowingAdvice {
	
	//execution 설정법 -> 맨처음 리턴타임(*)하고 띄어 쓰고 나서 패키지명/클래스/매소드/변수명
	// 즉, * com.spring.biz..(패키지안에 있는거 다포함)*Impl(Impl로끝나는 클래스안에).(찍고)*(..)(그안에모든메소드)
	
	
	
	//@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "e")
	public void exceptionLog(JoinPoint jp , Exception e) {
		
		String method = jp.getSignature().getName();
		
		System.out.println("[예외처리 AfterThrowing ] 비지니스 로직 수행 중 예외 발생 " + method +" "+ e.getMessage());
		
		
		
	}

	
	
}
