package truelecter.practice3;

/**
 * Created by TrueLecter on 01.02.2017.
 */
public class SpellCheckerA  implements  SpellChecker{

    public SpellCheckerA(){
        System.out.println("Inside SpellCheckerA constructor.");
    }

    @Override
    public void checkSpelling() {
        System.out.println("Checking spelling with spell checked variant A");
    }

    @Override
    public String about() {
        return "SpellChecker version A";
    }
}
