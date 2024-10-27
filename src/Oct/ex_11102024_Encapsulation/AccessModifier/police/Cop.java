package Oct.ex_11102024_Encapsulation.AccessModifier.police;

public class Cop {
    private int gun;
    private String id_Card;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() {
        System.out.println("Yes, You can!!");
    }
}
