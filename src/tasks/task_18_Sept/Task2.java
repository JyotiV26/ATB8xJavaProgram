package tasks.task_18_Sept;

public class Task2 {
    public static void main(String[] args) {

        int a1 = 10;
        System.out.println(--a1 + a1-- + a1--); //Result = 26
        System.out.println(a1); //Result = 7

        int a2 = 10;
        System.out.println(--a2 + a2++ + a2--); //Result = 28
        System.out.println(a2); //Result = 9

        int a3 = 10;
        System.out.println(a3-- + a3-- + a3--); //Result = 27
        System.out.println(a3); //Result = 7
    }
}
