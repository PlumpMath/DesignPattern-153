/**
 * 
 */
package ObserverPattern;

/**
 * @author Toufiq
 *
 */
import java.util.ArrayList;

interface Observer {
       public void update(String availability);
}

interface Subject {
       public void registerObserver(Observer observer);

       public void removeObserver(Observer observer);

       public void notifyObservers();
}

class Product implements Subject{

	private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String productName;
    private String productType;
    String availability;
    
    
	public Product(String productName, String productType,String availability) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.availability=availability;
	}
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		notifyObservers();
	}

	public void notifyObservers() {
		System.out.println("Notifying to all the subscribers when product became available");
		 for (Observer ob : observers) {
             ob.update(this.availability );
      }

	}

	public void registerObserver(Observer observer) {
		 observers.add(observer);
		
	}

	public void removeObserver(Observer observer) {
		 observers.remove(observer);
		
	}

}

class Person implements Observer{

	String personName;

	public Person(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void update(String availabiliy) {
		
		System.out.println("Hello "+personName+", Product is now "+availabiliy+" on our site");
	}
}

public class ObserverTest {

       public static void main(String args[]) {
    	       	   
    	   Person person1 = new Person("Toufiq");
    	   Person person2 = new Person("Mahmud");
    	   
    	   Product mobile = new Product("Samsung", "Mobile", "Not Available");
    	   
    	   //when when available, notify both person object.
    	   
    	   mobile.registerObserver(person1);
    	   mobile.registerObserver(person2);
    	   
    	   mobile.setAvailability("Available");
    	   
    	   mobile.removeObserver(person1);
    	   mobile.removeObserver(person2);

       }
}