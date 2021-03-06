package truelecter.practice3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by TrueLecter on 01.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");

        te.spellCheck();

        System.out.println("Available spell checkers: ");
        te.getAvailableSpellCheckers().forEach(spellChecker -> System.out.println(spellChecker.about()));
    }
}
