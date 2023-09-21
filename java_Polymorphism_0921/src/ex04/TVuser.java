package ex04;

public class TVuser {

	public static void main(String[] args) {

		TV tv = new SamsungTVSub();//수정시 new LgTV로 객체만 바꿔주면 됨
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		
		
	}

}
