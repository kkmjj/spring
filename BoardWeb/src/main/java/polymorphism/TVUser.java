package polymorphism;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.ioc.injection.CollectionBean;

public class TVUser {

	public static void main(String[] args) {
		//xml과 연동해서 spring 사용하기  factory 라는 컨테이너 만들기 
		
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		
		TV tv = (TV) factory.getBean("tv"); // 컨테이너의 tv라는 id 값을 가져와서 결합 
		tv.poweron();						//현재 xml에서 tv라는 객체가 삼성 클래스 임으로 삼성 티비 켬 이라는 결과 
		tv.volumUp(); 						// xml에서 sonny를 samsung에 결합해 놔서 메인에서 안건들고 그냥 결합 된거 사용가능 
	
		

		 
		
		factory.close();
		
	}

}
