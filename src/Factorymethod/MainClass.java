/**
 * 
 */
package Factorymethod;

/**
 * @author LeNoVo
 * 
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int type = 2;
		IFactory factory = Factory.getProduct(type);
		factory.display();

	}

}
