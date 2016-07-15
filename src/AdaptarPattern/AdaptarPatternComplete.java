/**
 * 
 */
package AdaptarPattern;

/**
 * @author Toufiq
 *
 */
class WordAdaptee implements IReport{
    public void report(String s) {
        System.out.println(s +" Word");
    }
}

class ExcellAdaptee implements IReport{
    public void report(String s) {
        System.out.println(s +" Excel");
    }
}


class ReportAdapter implements IReport{
    WordAdaptee wordAdaptee=new WordAdaptee();
    @Override
    public void report(String s) {
        wordAdaptee.report(s);
    }
}

interface IReport {
    public void report(String s);
}

public class AdaptarPatternComplete {
    public static void main(String[] args) {

        //create the interface that client wants
        IReport iReport=new ReportAdapter();

        //we want to write a report both from excel and world
        iReport.report("Trial report1 with one adaptee");  //we can directly write the report if one adaptee is avaliable 

        //assume there are N adaptees so it is like in our example
        IReport[] iReport2={new ExcellAdaptee(),new WordAdaptee()};

        //here we can use Polymorphism here  
        for (int i = 0; i < iReport2.length; i++) {
            iReport2[i].report("Trial report 2");
        }
    }
}
