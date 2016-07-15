/**
 * 
 */
package DecoratorPattern;

/**
 * @author Toufiq
 *
 */
public class EncryptionDecorator implements iEncryption{
	
	protected iEncryption encryption;
	
	public EncryptionDecorator(iEncryption encryption) {
		// TODO Auto-generated constructor stub
		this.encryption = encryption;
	}

	@Override
	public void generateEncryption() {
		// TODO Auto-generated method stub
		this.encryption.generateEncryption();
		
	}

}
