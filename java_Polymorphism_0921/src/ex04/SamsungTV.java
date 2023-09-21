package ex04;

public abstract class SamsungTV extends TV{
	//추상클래스는 자신의 인스턴스를 가질수없음(객체 생성X) 참조는 가능
	//overriding
	public void powerOn() {
		System.out.println("SamsungTV 전원 키기");
	}
//	public void powerOff() {
//		System.out.println("SamsungTV 전원 끄기");
//	}
	public void volumUp() {
		System.out.println("SamsungTV 소리 키우기");
	}
	public void volumDown() {
		System.out.println("SamsungTV 소리 줄이기");
	}
	
}
