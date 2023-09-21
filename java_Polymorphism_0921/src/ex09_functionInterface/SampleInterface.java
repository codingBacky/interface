package ex09_functionInterface;

@FunctionalInterface //추상메서드 1개만 존재
public interface SampleInterface {
	void sample();
	//void sample2() {}; 인스턴스 메소드는 interface에 쓸수 없음
	default void sample2() {} //디폴트 메서드는 작성가능
}
