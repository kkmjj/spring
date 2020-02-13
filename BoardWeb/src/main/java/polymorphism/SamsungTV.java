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
		System.out.println("sony ������");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("sony speaker ������");
		this.speaker = speaker;
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println("sony speaker,price ������");
		this.speaker = speaker;
		this.price = price;
	}
	

	@Override
	public void poweron() {
		System.out.println("�Ｚ Ƽ�� �Ҵ�" + price);

	}

	@Override
	public void poweroff() {
		System.out.println("�Ｚ Ƽ�� ����");

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
