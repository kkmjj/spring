package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//@Service //�� �ϰ� �Ǹ� printLog before point cut�� �ι� ����� ������ ���� �𸣰ڴ�....
//@Aspect				
public class LogAdvice {
//
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	//com.springbook.biz..���� Impl�� ������ ��ü ���� aop ����
//	public void allPointcut() {}
//	
//	@Before("allPointcut()")
	public void printLog() {
		System.out.println("���� �α� ������ ���� ���� �� ���� LogAdvice");
		
	}
}
