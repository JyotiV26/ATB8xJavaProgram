package tasks.task_04_Oct;

//Create a Person Class with 10 A, 5 Behavior( All types of Methods)
// and use the DC and PC to set the values, Create 5 Objects.

public class Task {
    public static void main(String[] args) {
        Person one = new Person();
        one.f_name = "David";
        System.out.println(one.f_name);
        one.walk();
        one.talk();
        one.sleep("Sam");
        one.eat(10120L);


        Person three = new Person("Jack", "Crossman", 34, 'H', 787789L);
        System.out.println(three.f_name);
        System.out.println(three.l_name);
        System.out.println(three.age);
    }
}


