package tasks.task_27_Sept;

//Task3: Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=100)
        {
            sum = sum + i;
            System.out.println(sum);
            i++;
        }
    }
}
