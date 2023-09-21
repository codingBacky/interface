package ex06_interfaceEx;

public class SoundableExample {

	public static void printSound(Soundable soundable) {//
		System.out.println(soundable.sound());//
	}

	public static void main(String[] args) {
		printSound(new Cat());//
		printSound(new Dog());
		
		Soundable sounda = new Cat();			//와 같음
		System.out.println(sounda.sound());
	}
}
