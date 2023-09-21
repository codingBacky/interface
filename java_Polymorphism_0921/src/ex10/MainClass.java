package ex10;

public class MainClass {

	public static void main(String[] args) {
		
		func(new A());
	}

	static void func(Object object) {
		
		//object가 참조하고 있는 대상이 A이거나 A를 상속한 클래스면 true
		
		if (object instanceof A) {
			A a = (A) object;
			a.funcA();
		}
		System.out.println("종료");
	}

}
