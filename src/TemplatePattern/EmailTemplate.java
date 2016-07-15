/**
 * 
 */
package TemplatePattern;

/**
 * @author Toufiq
 *
 */
public abstract class EmailTemplate {
	
	public String emailHeader = "Email Header";
	public String emailFooter = "Email Footer";
	
	abstract String emailBody();

}
