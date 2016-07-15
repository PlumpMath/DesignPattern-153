/**
 * 
 */
package Abstractfactory;

/**
 * @author LeNoVo
 * 
 */
public class FactoryA implements AbstractProduct {

	private static IFactoryA _factoryA;

	@Override
	public IFactoryA getFactoryA(int type) {
		if (type == 1)
			_factoryA = new ProductAFactoryA();
		else if (type == 2)
			_factoryA = new ProductBFactoryA();

		return _factoryA;
	}

	@Override
	public IFactoryB getFactoryB(int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
