package org.consoleQuiz;

import java.util.ArrayList;

//i have messed up by including the answers in the Question constructor, the Check Box questions make this too difficult,
//i will follow along with the recordings of the studio review to refactor this. 
public class Main {
    public static void main(String[] args) {
        Quiz  quiz = new Quiz();

        MCQuestion multiChoiceQ = new MCQuestion("What is St. Louis?", new ArrayList<String>() {{
            add("A great king.");
            add("A place with a big arch.");
            add("A place with a big space needle.");
        }}, new ArrayList<Integer>() {{
            add(1);
        }});

        //the answers part for CBQuestions needs to be altered to allow for multiple answers
        CBQuestion checkBoxQ = new CBQuestion("What is a cat?", new ArrayList<String>() {{
            add("Cute.");
            add("Sometimes annoying.");
            add("Usually soft.");
        }}, new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }});

        TFQuestion trueFalseQ = new TFQuestion("HTML is a programming language.", new ArrayList<Integer>(2));

        quiz.addQuestion(multiChoiceQ);
        quiz.addQuestion(checkBoxQ);
        quiz.addQuestion(trueFalseQ);

        int score = quiz.runQuiz();
        System.out.println("Your score: " + score);
    }
}