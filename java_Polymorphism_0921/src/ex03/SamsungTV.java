package ex03;

public class SamsungTV extends TV{
	
	//overriding
	public void powerOn() {
		System.out.println("SamsungTV 전원 키기");
	}
	public void powerOff() {
		System.out.println("SamsungTV 전원 끄기");
	}
	public void volumUp() {
		System.out.println("SamsungTV 소리 키우기");
	}
	public void volumDown() {
		System.out.println("SamsungTV 소리 줄이기");
	}
	
}
