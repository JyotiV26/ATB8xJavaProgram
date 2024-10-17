package tasks.task_20_Sept;

public class Task2 {
    // Ternary Operators to handle multiple conditions.
// Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C

    public static void main(String[] args) {
        int score = 90;
        String grade = (score >= 90) ? "A" : (score >= 80 && score <= 89) ? "B" :
                (score >= 70 && score <=79) ? "C" : "Fail";
        System.out.println("Grade is " + grade);

    }
}