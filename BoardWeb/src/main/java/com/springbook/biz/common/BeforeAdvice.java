package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service	// 이건 또 있어야지 1번 실행되네 ... 혹시 Aspect이 여러번이면 있어야 되고 그런건가 .. .;
@Aspect
public class BeforeAdvice {
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	// 매개변수 이름을 단지 함수 명으로 사용하는것 뿐 
//	public void allPoint() {
//		
//	}
	
	
	
	@Before("PointcutCommon.allPoint()")
	public void beforelog(JoinPoint jp) {
		
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[사전처리] 비지니스 로직 수행 전 동작 " + method + ". " +args[0].toString());
	}

}
