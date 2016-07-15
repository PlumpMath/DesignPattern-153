/**
 * 
 */
package DecoratorPattern;

/**
 * @author Toufiq
 *
 */
public class DESEncryption extends EncryptionDecorator{

	public DESEncryption(iEncryption encryption) {
		super(encryption);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void generateEncryption() {
		// TODO Auto-generated method stub
		encryption.generateEncryption();
		System.out.println("DESEncryption - generateEncryption()");
		
	}

}
