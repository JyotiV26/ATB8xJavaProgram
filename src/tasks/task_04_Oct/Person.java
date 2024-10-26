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
  Person() {
       f_name = "Simmy";
       age = 25;
  }

    void walk(){
        System.out.println("Name and age of person - " + f_name + " " + age);
       //System.out.println("Without Parameter and Return type");

  }

    //Parametrized Constructor
    Person (String l_name, char section){
      l_name = "Smith";
      section = 'A';
    }

    void talk(){
        System.out.print("Last name and section of person - " + l_name + section);
        //System.out.println("Without Parameter, with Return type");
        //return ;
    }

    String sleep(String f_name){
        //System.out.println("Simmy can sleep");
        //System.out.println("With Parameter and Return type");
        return "I am sleeping";
    }

    void eat(int age){
       // System.out.println("With Parameter, without Return type");
        //System.out.println("Eat");
    }
}
