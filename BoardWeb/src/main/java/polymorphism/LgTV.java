package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv") //어노테이션 
public class LgTV implements TV {
	
	@Qualifier("apple")
	@Autowired //Componet로 생성된 세터 
	private Speaker speaker;


	public void poweron() {
		System.out.println("LG 티비 켠다");

	}


	public void poweroff() {
		System.out.println("LG  티비 끈다");

	}


	public void volumUp() {
		speaker.volumeUp();

	}

	@Override
	public void volumDown() {
		speaker.volumeDown();

	}

}
