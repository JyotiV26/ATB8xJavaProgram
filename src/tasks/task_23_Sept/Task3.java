package tasks.task_23_Sept;

/* Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on
user selection using a switch statement.
Input. - value
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c */

public class Task3 {
    public static void main(String[] args) {
int value = 20;
int result;
int conversion = 1;
switch (conversion)
{
    case 1:
        result = (int) (value / 1.6);
        System.out.println("coversion from Kilometer to miles is " + result);
        break;
    case 2:
        result = ((value*9)/5)+32;
        System.out.println("coversion from celcius to FH is " + result);
        break;
    default:
        System.out.println("Invalid Input");
        break;
}
    }
}
