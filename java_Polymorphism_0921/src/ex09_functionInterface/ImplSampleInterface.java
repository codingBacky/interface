package ex09_functionInterface;

public class ImplSampleInterface implements SampleInterface{

	@Override
	public void sample() {
		System.out.println("무조건 구현 해줘야함");
	}
	
	public void sample2() {
		System.out.println("선택적 구현");
	}

}
