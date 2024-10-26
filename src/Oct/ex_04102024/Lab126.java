package Oct.ex_04102024;

public class Lab126 {
    public static void main(String[] args) {
        Dog gs = new Dog("Pug", "Doggo", 1, 4);
        System.out.println(gs.breed);
        System.out.println(gs.age);

        Dog bd = new Dog("BD");
        System.out.println(bd.breed);
        System.out.println(bd.name);
        System.out.println(bd.age);
    }
}
