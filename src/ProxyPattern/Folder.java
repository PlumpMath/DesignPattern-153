/**
 * 
 */
package ProxyPattern;

/**
 * @author Toufiq
 * 
 */
public class Folder implements IFolder {

	public void performOperations() {
		// access folder and perform various operations like copy or cut files
		System.out.println("Performing operation on folder");
	}

	@Override
	public void downloadFile() {
		// TODO Auto-generated method stub
		System.out.println("File is Downloading...");
	}

}
