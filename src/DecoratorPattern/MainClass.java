/**
 * 
 */
package DecoratorPattern;


/**
 * @author LeNoVo
 * 
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		iEncryption aesEncryption = new AESEncryption(new EncryptionData());
		aesEncryption.generateEncryption();
		
		System.out.println("\n*****");
		
		iEncryption desEncryption = new AESEncryption(new DESEncryption(new EncryptionData()));
		desEncryption.generateEncryption();
	}
}
