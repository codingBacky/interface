package ex04;

public class LgTV extends TV{
	
	//overriding
	//일반 상속의 경우 빠진 메서드가 있어도 상위클래스에서 참조하기때문에 오류가 나타나지 않아 찾기 어렵다.
	public void powerOn() {
		System.out.println("LgTV 전원 키기");
	}
	public void powerOff() {
		System.out.println("LgTV 전원 끄기");
	}
	public void volumUp() {
		System.out.println("LgTV 소리 키우기");
	}
	public void volumDown() {
		System.out.println("LgTV 소리 줄이기");
	}
	
}
