/**
 * 
 */
package TemplatePattern;

/**
 * @author Toufiq
 *
 */
public class MainClass {
	
	public static void main(String[] args){
		
		NewYearEmail newYearEmail = new NewYearEmail();
		System.out.println("Email Header : " + newYearEmail.emailHeader);
		System.out.println("Email Body : " + newYearEmail.emailBody());
		System.out.println("Email Footer : " + newYearEmail.emailFooter);
	}


}
