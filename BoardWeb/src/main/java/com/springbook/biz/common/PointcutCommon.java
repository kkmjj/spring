package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//Pointcut�� �ܺο� �ξ� �������� ��� �����̽��� ��� �����ϵ��� ������� 


@Aspect
public class PointcutCommon {

	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	// �� �� �κ��� �ȵǴ��� ���ذ� �ȵǳ� ....Impl�׳��� �ȵǳ� insert�� �ȵǴ°� ���⵵�ϰ�
	public void allPoint() {}
	
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
	
	
	
}
