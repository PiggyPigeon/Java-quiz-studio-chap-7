package org.consoleQuiz;
import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> options;
    private ArrayList<Integer>  answer;



    public Question(String question, ArrayList<String> options, ArrayList<Integer> answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }
    public ArrayList<String> getOptions() {
        return options;
    }

    public ArrayList<Integer> getAnswer() {
        return answer;
    }

    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }

    }


}
