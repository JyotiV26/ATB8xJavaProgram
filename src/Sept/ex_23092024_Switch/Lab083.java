package Sept.ex_23092024_Switch;

public class Lab083 {
    //JDK>13 introduced using multiple matches. Also multiple print commands are allowed
    public static void main(String[] args) {
    int itemcode = 003;
    switch (itemcode)
    {
        case 001, 002, 003:
            System.out.println("This is X category");
            System.out.println("Also Z category");
            break;
        case 004, 005, 006:
            System.out.println("This is Y category");
            break;
        default:
            System.out.println("No Category");
            break;
    }

}
}
