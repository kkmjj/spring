package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sony")	
// speaker를 상속 받고 있는 스피커가 sony만 있을떄는 상관 없지만 apple이라는 곳에 Component("apple")을 하게 되면 speaker가 두개가 되어
// @Autowired 로 주입할때 어떤 것을 주입할지 애매해서 오류 난다. 이것을 해결하기 위해서   @Autowired 한곳에 @Qualifier("sony") 를 해준다. 
public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("Sony 생성");
	}
	
	public void volumeUp() {
		System.out.println("Sony 소리 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("Sony 소리 내린다.");
	}

}
