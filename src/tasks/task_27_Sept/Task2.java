package tasks.task_27_Sept;

//Task2: Create a Java program that prints the first 5 even numbers using a do-while loop.

public class Task2 {
    public static void main(String[] args) {
        int count = 1;
        int num = 2;

        do {
            System.out.println(num);
            num +=2;
            count++;
        }
        while (count<=5);
    }
}
