package tasks.task_23_Sept;
import java.util.Scanner;

public class Task1 {
    //Create a simple calculator that performs addition, subtraction, multiplication, and division, modulus
    // based on user input using switch statements.
    //Inputs :   num 1, num 2, +
    //Output :  num1+num2 → print information.
    public static void main(String[] args) {
        {
            int a = 10;
            int b = 20;
            char operation = '*';
            switch (operation) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}