package truelecter.practice3;

/**
 * Created by TrueLecter on 01.02.2017.
 */
public class SpellCheckerB implements SpellChecker {

    public SpellCheckerB() {
        System.out.println("Inside SpellCheckerB constructor.");
    }

    @Override
    public void checkSpelling() {
        System.out.println("Checking spelling with spell checked variant B");
    }

    @Override
    public String about() {
        return "SpellChecker version B";
    }
}
