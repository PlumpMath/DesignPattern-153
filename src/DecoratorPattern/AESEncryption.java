/**
 * 
 */
package DecoratorPattern;

/**
 * @author Toufiq
 *
 */
public class AESEncryption extends EncryptionDecorator{

	public AESEncryption(iEncryption encryption) {
		super(encryption);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void generateEncryption() {
		// TODO Auto-generated method stub
		encryption.generateEncryption();
		System.out.println("AESEncryption - generateEncryption()");
		
	}

}
