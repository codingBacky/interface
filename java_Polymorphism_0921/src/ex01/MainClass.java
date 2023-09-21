package ex01;

public class MainClass {

	public static void main(String[] args) {
		Somi somi = new Parent();//하위클래스를 참조한다.
		somi.somiRol();//오버라이딩했기 때문에 가까운 위치의 Parent에서 호출함
	
		System.out.println();
	}

}
