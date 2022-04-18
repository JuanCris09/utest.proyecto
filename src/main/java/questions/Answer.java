package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UtestCompletPage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String RegisForm = Text.of(UtestCompletPage.COMPLETE_BUTTON).
                viewedBy(actor).asString();
        if (question.equals(RegisForm)){
            result= true;
        }else {
            result = false;
        }
        return result;
    }
}
