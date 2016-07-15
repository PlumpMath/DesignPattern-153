/**
 * 
 */
package Abstractfactory;

/**
 * @author LeNoVo
 * 
 */
public interface AbstractProduct {

	public IFactoryA getFactoryA(int type);

	public IFactoryB getFactoryB(int type);

}
