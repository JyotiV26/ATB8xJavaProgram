package tasks.task_20_Sept;

public class Task1 {
    //By using Ternary Operators, find max between 3 numbers.
    //Input int - a,b,c - a = 10, b = 20, c = 45
    // Max → a,b,c → c
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 45;
        int max;
        max = (a>b && a>c) ? a : (b > a && b > c) ? b : (c > a && c > b) ? c : a ;
        //Another way - max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
