package polymorphism;



// 이름맘대로 지정하고 xml에 안들어도 없어도 sony라는 객체를 알아서 만들어줌 -> 현재는 이객체를 어노테이션으로 만들고 LGTV에서 Speaker를 @Autowired 해서 주입시킴
public interface Speaker {
	
	void volumeUp();
	void volumeDown();

}
