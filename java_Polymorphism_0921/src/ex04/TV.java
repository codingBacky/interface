package ex04;

abstract public class TV {
	//추상메서드는 '반드시' 구현을 해줘야 한다. 오류를 내서 찾을수 있도록 해줌
	//추상클래스는 자신의 인스턴스를 가질수없음(객체 생성X) 참조는 가능
	public abstract void powerOn();
	
	public abstract void powerOff();
	
	public abstract void volumUp();
	
	public abstract void volumDown();

}
