package Sept.ex_23092024_Switch;

public class Lab090 {
    public static void main(String[] args) {

    char c = 'C'; //ASCII 67
        switch (c) {
        case 'A'+1: //concatenation is allowed, this means 65+1=66 in ASCII
            System.out.println("B");
            break;
        case 'A':
            System.out.println("A");
            break;
        case 'A'+2: //65+2 = 67, hence C will be printed
            System.out.println("C");
            break;

    }
    }
}
