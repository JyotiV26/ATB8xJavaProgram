package tasks.task_25_Sept;

//Task3: Prime Number from 1 to 100. (for loop)
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt();

            if(n%(n/2) > 0)
            {
                System.out.println("It is a prime number");
            }
            else {
                System.out.println("Not a prime");

        }
    }
}