/**
 * 
 */
package Abstractfactory;

/**
 * @author LeNoVo
 * 
 */
public class FactoryB implements AbstractProduct {

	private static IFactoryB _factoryB;

	@Override
	public IFactoryA getFactoryA(int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IFactoryB getFactoryB(int type) {
		if (type == 1)
			_factoryB = new ProductAFactoryB();
		else if (type == 2)
			_factoryB = new ProductBFactoryB();

		return _factoryB;
	}

}
