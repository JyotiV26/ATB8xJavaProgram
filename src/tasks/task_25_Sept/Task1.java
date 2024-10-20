package tasks.task_25_Sept;

//Task 1: Table of number n = 10, print table with For or while.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);

        }
    }
}
