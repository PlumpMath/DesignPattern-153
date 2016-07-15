/**
 * 
 */
package Factorymethod;

/**
 * @author LeNoVo
 * 
 */
public class Factory {

	private static IFactory _concreteProduct;

	public static IFactory getProduct(int type) {
		if (type == 1)
			_concreteProduct = new ConcreteProductA();
		else if (type == 2)
			_concreteProduct = new ConcreteProductB();
		return _concreteProduct;
	}

}
