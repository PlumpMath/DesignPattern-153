/**
 * 
 */
package AdaptarPattern;

/**
 * @author Toufiq
 *
 */
public class MainClass {
	
	public static void main(String[] args){
		
		PaymentAdaptar adaptar = new PaypalAdapter(new Paypal());
		adaptar.pay();
		
		System.out.println("\n*****");
		
	}

}
