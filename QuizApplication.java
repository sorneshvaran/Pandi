import java.util.Arrays;
import java.util.List;

public class QuizApplication {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // --- 10 Basic Java Questions ---
        
        // Q1: Fundamentals
        Question q1 = new Question(
            "1. Which keyword is used to prevent method overriding in Java?",
            Arrays.asList("static", "abstract", "final", "const"),
            2 // "final"
        );

        // Q2: Data Types
        Question q2 = new Question(
            "2. Which of these is NOT a Java primitive data type?",
            Arrays.asList("int", "float", "String", "char"),
            2 // "String"
        );

        // Q3: JVM
        Question q3 = new Question(
            "3. What does JVM stand for?",
            Arrays.asList("Java Virtual Machine", "Java Verification Module", "Joint Vector Model", "Just Valid Model"),
            0 // "Java Virtual Machine"
        );
        
        // Q4: Inheritance
        Question q4 = new Question(
            "4. Which keyword is used to inherit a class?",
            Arrays.asList("implements", "extends", "inherits", "subclass"),
            1 // "extends"
        );

        // Q5: Arrays
        Question q5 = new Question(
            "5. What is the index of the first element in a Java array?",
            Arrays.asList("1", "2", "0", "1.5"),
            2 // "0"
        );
        
        // Q6: Method Overloading
        Question q6 = new Question(
            "6. Which concept allows a class to have multiple methods with the same name but different parameters?",
            Arrays.asList("Method Overriding", "Method Hiding", "Method Overloading", "Method Signature"),
            2 // "Method Overloading"
        );

        // Q7: Main Method
        Question q7 = new Question(
            "7. Which modifier makes the main method accessible by the JVM without creating an instance of the class?",
            Arrays.asList("private", "protected", "static", "final"),
            2 // "static"
        );

        // Q8: Object Creation
        Question q8 = new Question(
            "8. What is the operator used to create an object in Java?",
            Arrays.asList("create", "object", "new", "instance"),
            2 // "new"
        );

        // Q9: Garbage Collection
        Question q9 = new Question(
            "9. What is responsible for automatically managing memory (freeing unused objects) in Java?",
            Arrays.asList("Memory Manager", "Garbage Collector", "Pointer Deallocator", "System Cleaner"),
            1 // "Garbage Collector"
        );
        
        // Q10: Exceptions
        Question q10 = new Question(
            "10. Which block is used to enclose the code that might throw an exception?",
            Arrays.asList("catch", "throw", "try", "finally"),
            2 // "try"
        );


        // Add all 10 questions to the quiz object
        List<Question> allQuestions = Arrays.asList(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10);
        allQuestions.forEach(quiz::addQuestion);

        // Start the quiz
        System.out.println("Welcome to the 10-Question Basic Java Quiz!");
        System.out.println("=============================================");
        quiz.start();
    }
}