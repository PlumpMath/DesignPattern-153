/**
 * 
 */
package Abstractfactory;

/**
 * @author LeNoVo
 * 
 */
public class AbstractFactory {

	private static AbstractProduct _factoryType;

	public static AbstractProduct getFactory(int factoryType) {
		if (factoryType == 1)
			_factoryType = new FactoryA();
		if (factoryType == 2)
			_factoryType = new FactoryB();
		return _factoryType;
	}

}
