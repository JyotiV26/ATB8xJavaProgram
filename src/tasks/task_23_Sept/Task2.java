package tasks.task_23_Sept;

public class Task2 {
    /*Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
    Input  - 12, Out - Dec. */

    public static void main(String[] args) {
        int month = 5;
        switch (month) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invalid Input");
        }
    }
}
