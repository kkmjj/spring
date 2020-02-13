package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv") //������̼� 
public class LgTV implements TV {
	
	@Qualifier("apple")
	@Autowired //Componet�� ������ ���� 
	private Speaker speaker;


	public void poweron() {
		System.out.println("LG Ƽ�� �Ҵ�");

	}


	public void poweroff() {
		System.out.println("LG  Ƽ�� ����");

	}


	public void volumUp() {
		speaker.volumeUp();

	}

	@Override
	public void volumDown() {
		speaker.volumeDown();

	}

}
