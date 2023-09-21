package ex04;

public interface TVInter {
	//추상메서드는 '반드시' 구현을 해줘야 한다. 오류를 내서 찾을수 있도록 해줌
	public void powerOn();
	
	public void powerOff();
	
	public void volumUp();
	
	public void volumDown();

}
