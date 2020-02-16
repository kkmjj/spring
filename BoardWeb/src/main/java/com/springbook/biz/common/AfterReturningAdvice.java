package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;


@Service
@Aspect
public class AfterReturningAdvice {
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void Pointcut() {}
//	
	
	
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning = "returnObj") // afterReturning�� �� allPoint�� �ȵǴ°�
	public void afterLog(JoinPoint jp, Object returnObj) {
		
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserVO)	// �ش簴ü�� UserVO ��ü���� Ȯ�� instanceof�� ��ü�� ���� �˷��ش�.
		{
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("��"))
			{
				System.out.println(user.getName() +"�� �α��� ");
			}
		}

		System.out.println("[���� ó��] �����Ͻ� ���� ���� �� ���� " + method + ". " +returnObj.toString());
	}

}
