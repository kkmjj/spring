package polymorphism;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.ioc.injection.CollectionBean;

public class TVUser {

	public static void main(String[] args) {
		//xml�� �����ؼ� spring ����ϱ�  factory ��� �����̳� ����� 
		
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		
		TV tv = (TV) factory.getBean("tv"); // �����̳��� tv��� id ���� �����ͼ� ���� 
		tv.poweron();						//���� xml���� tv��� ��ü�� �Ｚ Ŭ���� ������ �Ｚ Ƽ�� �� �̶�� ��� 
		tv.volumUp(); 						// xml���� sonny�� samsung�� ������ ���� ���ο��� �Ȱǵ�� �׳� ���� �Ȱ� ��밡�� 
	
		

		 
		
		factory.close();
		
	}

}
