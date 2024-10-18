package Sept.ex_23092024_Switch;

public class Lab082 {
    public static void main(String[] args) {
        int a = 98;
        switch (a)
        {
            case 98:
            System.out.println("98");
        }
        // Dupplicate condition gives error - java: orphaned case
        /* {
            case 98:
                System.out.println("98");
        } */
    }
}
