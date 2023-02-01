package org.consoleQuiz;

public class MultipleChoice extends Question {
    public MultipleChoice(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }
    @Override
    public String toString() {
        return "\nMultiple Choice:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }
}
