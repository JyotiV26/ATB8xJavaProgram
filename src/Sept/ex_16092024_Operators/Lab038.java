package Sept.ex_16092024_Operators;

public class Lab038 {
    public static void main(String[] args) {
        // Relational Operators  = boolean
        //  > < , >= <= , != , ! -> true or false
        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);

        int age_mamitha = 34;
        int age_pramod = 34;
//        boolean result = age_pramod > age_mamitha; // false
        boolean result = age_pramod >= age_mamitha; // false // age_pramod > age_mamitha or age_pramod =age_mamitha;;
        System.out.println(result);

    }
}
