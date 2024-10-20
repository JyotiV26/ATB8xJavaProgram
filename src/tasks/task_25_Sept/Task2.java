package tasks.task_25_Sept;

//Task 2: Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
// n = 1 ->  Fact = 1*1 -> 1
// n = 3 -> Fact = 3*2*1 -> 6

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
                
        int i = 1;
        while (i<=n)
        {
            System.out.println(n*(n-i));
            i++;
        }
    }

}

