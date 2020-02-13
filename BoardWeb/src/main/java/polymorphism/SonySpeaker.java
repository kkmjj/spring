package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sony")	
// speaker�� ��� �ް� �ִ� ����Ŀ�� sony�� �������� ��� ������ apple�̶�� ���� Component("apple")�� �ϰ� �Ǹ� speaker�� �ΰ��� �Ǿ�
// @Autowired �� �����Ҷ� � ���� �������� �ָ��ؼ� ���� ����. �̰��� �ذ��ϱ� ���ؼ�   @Autowired �Ѱ��� @Qualifier("sony") �� ���ش�. 
public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("Sony ����");
	}
	
	public void volumeUp() {
		System.out.println("Sony �Ҹ� �ø���.");
	}
	
	public void volumeDown() {
		System.out.println("Sony �Ҹ� ������.");
	}

}
