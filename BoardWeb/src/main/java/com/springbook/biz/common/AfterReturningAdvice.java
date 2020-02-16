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
	
	
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning = "returnObj") // afterReturning은 왜 allPoint가 안되는가
	public void afterLog(JoinPoint jp, Object returnObj) {
		
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserVO)	// 해당객체가 UserVO 객체인지 확인 instanceof는 객체의 형을 알려준다.
		{
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("팀"))
			{
				System.out.println(user.getName() +"님 로그인 ");
			}
		}

		System.out.println("[사후 처리] 비지니스 로직 수행 후 동작 " + method + ". " +returnObj.toString());
	}

}
