package Sept.ex_16092024_Operators;

public class Lab035 {

    public static void main(String[] args) {
        String first_name = "Joe";
        String last_name = "Verma";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b); //prints JoeVerma1010, as + is used for strings first as works as a concatenator
        System.out.println(first_name + last_name + (a + b)); //prints JoeVerma20
        System.out.println(a + b + first_name + last_name); //prints 20JoeVerma

    } }
