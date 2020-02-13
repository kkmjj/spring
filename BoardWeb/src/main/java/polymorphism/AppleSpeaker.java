package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {

	
	public AppleSpeaker() {
		System.out.println("AppleSpeaker »ý¼º");
	}
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker up");

	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker down");
	}

}
