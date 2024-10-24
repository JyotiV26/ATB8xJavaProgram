package tasks.task_02_Oct;

import java.util.Scanner;

public class Task3 {
    //Task3: Create a Class  ATBStudent and 5 Objects - (A/B) - github.com
    public static void main(String[] args) {
        ATBStudent amit = new ATBStudent();
        amit.age  =35;

        ATBStudent abhishek = new ATBStudent();
        abhishek.age = 65;

        ATBStudent aman = new ATBStudent();
        aman.phone = 65782729279l;

        ATBStudent ajay = new ATBStudent();
        ajay.address = "123 street";

        new ATBStudent();

        System.out.println(amit);
        System.out.println(aman);
    }
}
