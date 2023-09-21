package ex05;

public class MainClass {

	public static void main(String[] args) {
		
		Object object = new A();
		System.out.println(object.toString());
		
		A a = new A();
		a.funcA();
		
		B b = new B();
		b.funcA();
		b.toString();
		b.funcB();
		
		C c = new C();
		c.funcA();
		c.toString();
		c.funcB();
		c.funcC();

		System.out.println("--------------------");
		
		//funcB를 호출 할수 있는 방법
		A aa = new B();
		aa.funcA();
		aa.funcB();//class A에 funcB 메서드를 만들어 class B 에서 오버라이딩하게 함
		
		B bb = new B();
		bb.funcA();
		bb.funcB();
		
		B bbb = (B)aa;//A 타입을 B타입으로 형 변환을 시켜줌
		bbb.funcA();
		bbb.funcB();
		
		
		A a3 = new C();
		B b3 = (B)a3;
		b3.funcA();
		b3.funcB();
		
		C c3 = (C)a3;
		c3.funcA();
		c3.funcB();
		c3.funcC();
		
		
	}

}
