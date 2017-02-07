package truelecter.practice3;

import javax.xml.soap.Text;
import java.util.List;

/**
 * Created by TrueLecter on 01.02.2017.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    private List<SpellChecker> availableSpellCheckers;

    public TextEditor(){
        this(null);
    }

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void setAvailableSpellCheckers(List<SpellChecker> availableSpellCheckers) {
        this.availableSpellCheckers = availableSpellCheckers;
    }

    public List<SpellChecker> getAvailableSpellCheckers(){
        return availableSpellCheckers;
    }

    public void setSpellChecker(SpellChecker sc){
        spellChecker = sc;
    }
}