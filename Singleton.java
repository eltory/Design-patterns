/*
 * Singleton Pattern
 * Created by LSH on 2017. 9. 5..
 */
public class Singleton {
	
	// 초기 인스턴스 null
	private static Singleton singleton = null;
	// 외부접근 차
	private Singleton() {}
	// 싱글턴 인스턴스 유무에 따른 리
	public static Singleton getInstance(){
		if(singleton == null) {
			singleton = new Singleton();
		}return singleton;
	}
}
