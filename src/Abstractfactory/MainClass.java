/**
 * 
 */
package Abstractfactory;

/**
 * @author LeNoVo
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int factoryType = 2;
		int type = 2;
		AbstractProduct abstractProduct = AbstractFactory.getFactory(factoryType);
		
/*		IFactoryA factoryA = abstractProduct.getFactoryA(type);
		
		factoryA.display();*/
		
		IFactoryB factoryB = abstractProduct.getFactoryB(type);
		
		factoryB.display();

	}

}
