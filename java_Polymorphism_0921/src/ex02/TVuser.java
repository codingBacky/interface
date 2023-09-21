package ex02;

public class TVuser {

	public static void main(String[] args) {

		SamsungTV tv = new SamsungTV();//LgTV로 객체 수정시 아래에 메서드 이름을 다 수정해줘야함
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
	}

}
