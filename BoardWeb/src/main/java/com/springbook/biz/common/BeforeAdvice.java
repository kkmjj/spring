package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service	// �̰� �� �־���� 1�� ����ǳ� ... Ȥ�� Aspect�� �������̸� �־�� �ǰ� �׷��ǰ� .. .;
@Aspect
public class BeforeAdvice {
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	// �Ű����� �̸��� ���� �Լ� ������ ����ϴ°� �� 
//	public void allPoint() {
//		
//	}
	
	
	
	@Before("PointcutCommon.allPoint()")
	public void beforelog(JoinPoint jp) {
		
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[����ó��] �����Ͻ� ���� ���� �� ���� " + method + ". " +args[0].toString());
	}

}
