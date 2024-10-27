package tasks.task_04_Oct;

public class Person {
    String f_name;
    String l_name;
    int age;
    String address;
    long pin_code;
    float percentage;
    boolean isMale;
    char section;
    String city;
    String occupation;

    //Default Constructor
Person(){
    System.out.println("Default Constructor");
}

//Parameterized constructor
Person(String f_name, String l_name, int age, char section, long pin_code) {
    System.out.println("Parameterized Constructor");
    this.f_name = "Sam";
    this.l_name = "Smith";
    this.age = 20;
    this.section = 'A';
    this.pin_code = 102011L;
}

    void walk() {
        System.out.println("Walking");
        //("Without Parameter and Return type");
    }

    String talk() {
        System.out.println("Talking");
        //("Without Parameter, with Return type");
        return "something";
    }

    String sleep (String f_name) {
        System.out.println("Sleeping");
        //("With Parameter and Return type");
        return "something_else";
    }

    void eat(long pin_code) {
        System.out.println("Eating");
        //("With Parameter, without Return type");
    }

}


