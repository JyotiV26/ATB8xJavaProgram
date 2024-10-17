package tasks.task_20_Sept;

public class Task5 {
    //Task5: Leap Year Program - Find 2024

    public static void main(String[] args) {
        int year = 2024;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("2024 is a Leap year");
        }
            else
            {
                System.out.println("2024 is NOT a Leap year");
            }
        }
    }

