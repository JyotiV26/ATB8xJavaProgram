package tasks.task_18_Sept;
//Task 1: Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.

public class Task1 {
    public static void main(String[] args) {
        short b = 100;
        float a = b; // Widening - Implicit Casting
        float a1 = (float)b; // Widening - Explicit Casting
        System.out.println(a1);

        short u1  = 200;
        //byte u2 = u1; // Narrowing - Implicit Casting - not allowed by JVM
        byte u2 = (byte)u1; // Invalid Explicit Casting - Loss of data.
        System.out.println(u2);
    }
}
