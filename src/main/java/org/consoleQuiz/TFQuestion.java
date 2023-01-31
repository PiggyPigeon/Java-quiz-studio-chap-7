package org.consoleQuiz;

import java.util.ArrayList;

public class TFQuestion extends Question {
    public TFQuestion(String question, ArrayList<Integer> answer) {
        //why does below require two curly braces?
        super(question, new ArrayList<String>() {{
            add("True");
            add("False");
        }}, answer);
    }
}
