package Sept.ex_18092024_TypeCasting;

public class Lab050
{
    public static void main(String[] args) {
        // Type Casting
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        // Widening Example
        byte b = 10;
        int a = b; // Valid - Implicit Casting - JVM
        int a1 = (int)b; // Valid - Explicit Casting - JVM
        System.out.println(a1);

        // Narrowing Example
        int val = 200;
        //byte b1 = val; // Invalid Implicit Casting - JVM, not allowed
        byte b2 = (byte)val; // Invalid Explicit Casting - Loss of data.
        System.out.println(b2);

}
}
