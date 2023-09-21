package ex05;

public class A {

	private String name = "back";
	private int age = 30;


	void funcA() {
		System.out.println("A Class");
	}
	void funcB() {
		
	}
	
	
	//Object 클래스의 toString을 재정의(overriging)하여 접근 가능하도록 함
	public String toString() {
		return name + " : " + age;
	}
}
