import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KBCGame {
    public static void main(String[] args) {
        Map<String, String> questions = new HashMap<>();
        questions.put("Sachin is playing for which country?", "A");
        questions.put("Indore is in which state?", "B");
        questions.put("Capital of India?", "A");

        Map<String, String> options = new HashMap<>();
        options.put("Sachin is playing for which country?", "A).India\nB).Srilanka");
        options.put("Indore is in which state?", "A).U.P.\nB).M.P.");
        options.put("Capital of India?", "A).Delhi\nB).Indore");

        Map<String, String> userAnswers = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<String, String> entry : questions.entrySet()) {
            String question = entry.getKey();
            String correctAnswer = entry.getValue();
            String option = options.get(question);

            System.out.println(question);
            System.out.println("Please select the correct answer:");
            System.out.println(option);

            String userAnswer = scanner.nextLine();
            userAnswers.put(question, userAnswer);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct answer!");
            } else {
                System.out.println("Incorrect answer. The correct answer is " + correctAnswer);
            }
        }
    }
}
