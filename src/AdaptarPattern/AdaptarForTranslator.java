/**
 * 
 */
package AdaptarPattern;


/**
 * @author Toufiq
 *
 */

public class AdaptarForTranslator{
	public static void main(String[] args){
		EnglishTranslator englishTranslator = new EnglishTranslator();
		englishTranslator.languageTranslator();
		
		HindiTranslator hindiTranslator = new HindiTranslator();
		TranslatorAdaptar adaptar = new TranslatorAdaptar(hindiTranslator);
		adaptar.languageTranslator();
		
	}
}

interface ITranslator {
	
	public void languageTranslator();

}

class EnglishTranslator implements ITranslator{

	@Override
	public void languageTranslator() {
		// TODO Auto-generated method stub
		System.out.println("English Translator");
	}
	
}

class HindiTranslator implements ITranslator{

	@Override
	public void languageTranslator() {
		// TODO Auto-generated method stub
		System.out.println("Hindi to English Translator");
	}
	
}

class TranslatorAdaptar extends EnglishTranslator{
	
	HindiTranslator _HindiTranslator;
	
	public TranslatorAdaptar(HindiTranslator hindiTranslator) {
		// TODO Auto-generated constructor stub
		_HindiTranslator = hindiTranslator;
	}
	
	@Override
	public void languageTranslator() {
		// TODO Auto-generated method stub
		_HindiTranslator.languageTranslator();
	}
	
}
