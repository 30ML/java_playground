package sec05.exam04_싱글톤;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {};
	
	static Singleton getInstance() {
		return singleton;
	}
}
