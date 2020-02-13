package polymorphism;

public class SamsungTV implements TV {
	
	
	private SonySpeaker speaker;
	private int price;
	
	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SamsungTV() {
		System.out.println("sony 생성자");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("sony speaker 생성자");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("sony speaker,price 생성자");
		this.speaker = speaker;
		this.price = price;
	}
	

	@Override
	public void poweron() {
		System.out.println("삼성 티비 켠다" + price);

	}

	@Override
	public void poweroff() {
		System.out.println("삼성 티비 끈다");

	}



	@Override
	public void volumUp() {
		speaker.volumeUp();

	}

	@Override
	public void volumDown() {
		speaker.volumeDown();
	}

}
