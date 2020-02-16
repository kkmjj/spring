package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


//@Service
//@Aspect
public class AfterThrowingAdvice {
	
	//execution ������ -> ��ó�� ����Ÿ��(*)�ϰ� ��� ���� ���� ��Ű����/Ŭ����/�żҵ�/������
	// ��, * com.spring.biz..(��Ű���ȿ� �ִ°� ������)*Impl(Impl�γ����� Ŭ�����ȿ�).(���)*(..)(�׾ȿ����޼ҵ�)
	
	
	
	//@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "e")
	public void exceptionLog(JoinPoint jp , Exception e) {
		
		String method = jp.getSignature().getName();
		
		System.out.println("[����ó�� AfterThrowing ] �����Ͻ� ���� ���� �� ���� �߻� " + method +" "+ e.getMessage());
		
		
		
	}

	
	
}
