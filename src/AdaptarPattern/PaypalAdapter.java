/**
 * 
 */
package AdaptarPattern;


/**
 * @author Toufiq
 *
 */
public class PaypalAdapter implements PaymentAdaptar{
	
	protected Paypal _Paypal;
	
	public PaypalAdapter(Paypal paypal) {
		// TODO Auto-generated constructor stub
		_Paypal = paypal;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		_Paypal.payment();
	}
	
}