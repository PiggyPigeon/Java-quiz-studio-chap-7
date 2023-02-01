
package org.consoleQuiz;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Quiz {

    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] questionArray) {
        Collections.addAll(questions, questionArray);
    }

    public void updateScore() {
        numCorrect++;
    }

    public void runQuiz() {
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);
        for (Question question : questions) {
            // Print question and choices for user
            System.out.println(question);

            // Determine correct response(s)
            //I do not understand this ...
            ArrayList<Integer> correctResponses = new ArrayList<>();
            for (int choiceNum : question.getChoiceMap().keySet()) {
                if (question.getChoiceMap().get(choiceNum).isCorrect()) {
                    correctResponses.add(choiceNum);
                }
            }

            // Get actual response(s) from user & evaluate
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i < correctResponses.size()) {
                System.out.println("Please enter a number: ");
                int userResponse = input.nextInt();
                if (userResponses.contains(userResponse)) {
                    System.out.println("You already got that one!");
                } else if (!correctResponses.contains(userResponse)) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (int resp : correctResponses) {
                        System.out.println(question.getChoiceMap().get(resp).getContent());
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userResponse);
                    if (i == correctResponses.size() - 1) {
                        updateScore();
                    }
                    i++;
                }
            }
        }
        input.close();
    }

}





//below is my OG trashed code
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//import static java.lang.Integer.parseInt;

//public class Quiz {
//    private ArrayList<Question> questions;
//
//    public Quiz() {
//        this.questions = new ArrayList<>();
//    }
//
//    public void addQuestion(Question question){
//        questions.add(question);
//    }
//
//    public void removeQuestion(Question question) {
//        questions.remove(question);
//    }
//
//    //a method to turn an arrayList of strings into an arrayList of integers
//    private ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        for (String stringValue : stringArray) {
//            //Convert String to Integer, and store it into integer array list.
//            result.add(parseInt(stringValue));
//        }
//        return result;
//    }
//
//    public int runQuiz() {
//        Scanner sc = new Scanner(System.in);
//        int score = 0;
//        ArrayList<Integer> response = new ArrayList<>();
//        int userInput;
////loop through questions in the quiz
//        for (int i = 0; i < questions.size(); i++) {
//            Question question = questions.get(i);
//            //display the question and the options
//            System.out.println(question.getQuestion());
//            question.displayOptions();
//
////determine which type of question this is, if check boxes, do the following complex way
//            if (question instanceof CheckBox) {
//                //user enters a string with multiple answers
//                System.out.println("Enter your answers, separated by commas: ");
//                String input = sc.nextLine();
//                //split the string into an array of answers
//                String[] inputArray = input.split(",");
//                ArrayList<String> userAnswersArray = new ArrayList<String> (
//                        Arrays.asList(inputArray));
//                for (String userAnswer : userAnswersArray) {
//                    if (userAnswer == question.getAnswer()) {
//                        score++;
//                    }
//
//                }
//
//            }
//                score++;
//            }
//
//        return score;
//    }
//}


//run quiz method
//implement score, scanner, response fields.
// loop through questions, display questions and options
//prompt use for answer, store userAnswer
    //while loop- while userAnswer isnt " "
    //loop through array of answers,
     // if userAnswer matches then it is correct, score++
    //end loop when user enters " "
//go back to looping through questions array.