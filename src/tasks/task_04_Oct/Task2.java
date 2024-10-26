package tasks.task_04_Oct;

//Create a Person Class with 10 A, 5 Behavior( All types of Methods)
// and use the DC and PC to set the values, Create 5 Objects.

public class Task2 {
    public static void main(String[] args) {
        //Default Constructor
      Person sim = new Person();
       sim.walk();

        //Parametrized Constructor
        Person tim = new Person("Smith", 'A');
        tim.talk();
    }
}


