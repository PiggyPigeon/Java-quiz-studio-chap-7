package org.consoleQuiz;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {
    //every question requires a question in String format
    private final String question;
    //every question requires a hashmap of choices....are choices keys or values?
    private HashMap<Integer, Choice> choiceMap;

    // constructor takes in the question and an array of choices
    public Question(String question, Choice[] choiceArray) {
        this.question = question;
        //run array through method that converts to ArrayList, randomizes choices
        createRandomizedChoiceMap(choiceArray);
    }

   public String getQuestion() {
        return question;
   }

   public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
   }

   //every question requires a custom toString method...why?
   @Override
    public abstract String toString();

    void createRandomizedChoiceMap(Choice[] choiceArray) {
        choiceMap = new HashMap<>();
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for (int i=0; i < choiceList.size(); i++) {
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    //method to format the choices for console display
    String getFormattedChoices() {
        StringBuilder formattedChoices = new StringBuilder();
        for (int choiceNum : choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + "\n";
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

}

//below is my original attempt that got very tangled when it came to answers and
//
//public class Question {
//    private String question;
//    private ArrayList<String> options;
//    private ArrayList<Integer>  answer;
//
//
//
//    public Question(String question, ArrayList<String> options, ArrayList<Integer> answer) {
//        this.question = question;
//        this.options = options;
//        this.answer = answer;
//    }
//
//    public String getQuestion() {
//        return this.question;
//    }
//    public ArrayList<String> getOptions() {
//        return options;
//    }
//
//    public ArrayList<Integer> getAnswer() {
//        return answer;
//    }
//
//    public void displayOptions() {
//        for (int i = 0; i < options.size(); i++) {
//            System.out.println((i + 1) + ". " + options.get(i));
//        }
//
//    }
//
//
//}
