import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswerIndex; // 0-based index

    public Question(String questionText, List<String> options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    /**
     * Displays the question and its options to the console.
     */
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    /**
     * Checks if the user's provided answer is correct.
     * @param userAnswer The user's choice (1-based input).
     * @return true if the answer is correct.
     */
    public boolean isCorrect(int userAnswer) {
        return (userAnswer - 1) == correctAnswerIndex;
    }
}