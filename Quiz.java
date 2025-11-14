import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    /**
     * Starts the quiz loop, handles user input, and displays results.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        for (Question q : questions) {
            q.displayQuestion();
            int userAnswer = getUserAnswer(scanner, q.getOptions().size());
            
            if (q.isCorrect(userAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                // Provides feedback with the correct answer
                String correctOption = q.getOptions().get(q.getCorrectAnswerIndex());
                System.out.println("❌ Wrong! The correct answer was: " + (q.getCorrectAnswerIndex() + 1) + ". " + correctOption);
            }
            System.out.println("----------------------------------------");
        }

        // Display final results
        System.out.println("\n===== QUIZ FINISHED =====");
        System.out.println("Your final score is: " + score + " out of " + questions.size() + " (" + (score * 100 / questions.size()) + "%)");
        System.out.println("=========================\n");
        
        scanner.close(); 
    }

    /**
     * Helper method to get and validate user input.
     */
    private int getUserAnswer(Scanner scanner, int numOptions) {
        int choice = -1;
        while (choice < 1 || choice > numOptions) {
            try {
                System.out.print("Enter your choice (1-" + numOptions + "): ");
                choice = scanner.nextInt();
                
                if (choice < 1 || choice > numOptions) {
                    System.out.println("Invalid choice. Please enter a number between 1 and " + numOptions + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clears the invalid input token
            }
        }
        return choice;
    }
}