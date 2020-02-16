package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//Pointcut을 외부에 두어 공통으로 모든 어드바이스가 사용 가능하도록 만들어줌 


@Aspect
public class PointcutCommon {

	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")	// 왜 이 부분이 안되는지 이해가 안되네 ....Impl그냥이 안되네 insert가 안되는거 같기도하고
	public void allPoint() {}
	
	
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
	
	
	
}
