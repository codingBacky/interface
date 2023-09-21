package ex06_interface;

public class SPrinter implements CSPrint{

	@Override //annotation 선택이지만 쓰면 안정성이 높아진다. 상위 class를 재정의 한것이라 알려줌 
	public void print(String msg) {
		System.out.println("삼성프린터 흑백 출력 : ");
		System.out.println(msg);
	}

	@Override
	public void cprint(String msg) {
		System.out.println("삼성프린터 컬러 출력 : ");
		System.out.println(msg);
	}

}
