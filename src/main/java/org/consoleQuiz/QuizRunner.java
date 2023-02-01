package org.consoleQuiz;


public class QuizRunner {

    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        String q1 = "Which of the following are books by Jane Austen?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Jane Eyre"),
                new Choice("Pride and Prejudice", true),
                new Choice("Wives and Daughters"),
                new Choice("Mansfield Park", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The most-published author of all time is Agatha Christie.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueFalse question2 = new TrueFalse(q2, q2Choices);

        String q3 = "Which poem did history-making poet Amanda Gorman recite at the U.S. presidential inauguration in 2021?";
        Choice[] q3Choices = new Choice[] {
                new Choice("The Hill We Climb", true),
                new Choice("The Miracle of Morning"),
                new Choice("We Rise"),
                new Choice("New Day's Lyric")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        quiz.addQuestions(new Question[] {question1, question2, question3});

        quiz.runQuiz();

        System.out.println("\nYou answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!\n");

    }

}


//below is OG code and notes
//i have messed up by including the answers in the Question constructor, the Check Box questions make this too difficult,
//i will follow along with the recordings of the studio review to refactor this.
//public class Main {
//    public static void main(String[] args) {
//        Quiz  quiz = new Quiz();
//
//        MCQuestion multiChoiceQ = new MCQuestion("What is St. Louis?", new ArrayList<String>() {{
//            add("A great king.");
//            add("A place with a big arch.");
//            add("A place with a big space needle.");
//        }}, new ArrayList<Integer>() {{
//            add(1);
//        }});
//
//        //the answers part for CBQuestions needs to be altered to allow for multiple answers
//        CheckBox checkBoxQ = new CheckBox("What is a cat?", new ArrayList<String>() {{
//            add("Cute.");
//            add("Sometimes annoying.");
//            add("Usually soft.");
//        }}, new ArrayList<Integer>() {{
//            add(1);
//            add(2);
//            add(3);
//        }});
//
//        TFQuestion trueFalseQ = new TFQuestion("HTML is a programming language.", new ArrayList<Integer>(2));
//
//        quiz.addQuestion(multiChoiceQ);
//        quiz.addQuestion(checkBoxQ);
//        quiz.addQuestion(trueFalseQ);
//
//        int score = quiz.runQuiz();
//        System.out.println("Your score: " + score);
//    }
//}