package Sept.ex_23092024_Switch;

public class Lab084 {
    //jd>13 provides option to use -> for output
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode) {
            case 001, 002, 003 -> System.out.println("This is X category");
            case 004, 005, 006 -> System.out.println("This is Y category");
            default -> System.out.println("No Category");

        }
    }
}
