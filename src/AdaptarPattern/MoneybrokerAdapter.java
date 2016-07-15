/**
 * 
 */
package AdaptarPattern;


/**
 * @author Toufiq
 *
 */
public class MoneybrokerAdapter implements PaymentAdaptar{
	
	protected Moneybroker _Moneybroker;
	
	public MoneybrokerAdapter(Moneybroker moneybroker) {
		// TODO Auto-generated constructor stub
		_Moneybroker = moneybroker;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		_Moneybroker.payment();
	}
	
}