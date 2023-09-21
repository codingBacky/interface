package ex03;

abstract public class TV {
	//추상메서드는 '반드시' 구현을 해줘야 한다. 오류를 내서 찾을수 있도록 해줌
	public abstract void powerOn();
	
	public abstract void powerOff();
	
	public abstract void volumUp();
	
	public abstract void volumDown();

}
