/**
 * 
 */
package Singleton;

/**
 * @author LeNoVo
 * 
 */
public class SingletonClass {

	private static SingletonClass _instance;

	public static synchronized SingletonClass getInstance() {

		if (_instance == null) {
			return _instance = new SingletonClass();
		}

		return _instance;
	}
	
	public void disPlayMessage(){
		System.out.println("Singleton Object generated");
	}

}
