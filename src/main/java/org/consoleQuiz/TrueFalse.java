package org.consoleQuiz;

import java.util.ArrayList;
public class TrueFalse extends Question {

    public TrueFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nTRUE OR FALSE:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }

}



//below is my OG code
//public class TrueFalse extends Question {
//    public TrueFalse(String question, ArrayList<Integer> answer) {
//        //why does below require two curly braces?
//        super(question, new ArrayList<String>() {{
//            add("True");
//            add("False");
//        }}, answer);
//    }
//}
