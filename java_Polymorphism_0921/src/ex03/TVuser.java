package ex03;

public class TVuser {

	public static void main(String[] args) {

		TV tv = new SamsungTV();//수정시 new LgTV로 객체만 바꿔주면 됨
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumDown();
		
		
	}

}
