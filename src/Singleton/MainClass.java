package Singleton;

public class MainClass {

	public static void main(String args[]) {

		SingletonClass instance = SingletonClass.getInstance();
		instance.disPlayMessage();
	}

}
