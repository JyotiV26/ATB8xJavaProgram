package tasks.task_20_Sept;

public class Task3 {
    /* Triangle Classifier ( If) - Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle.
side1, side2, side3 -> */

    public static void main(String[] args) {
        int a = 90, b = 20, c = 10; //sides of a triangle
        String Type;

        if (a == b && b == c)
        {
            Type = "Equilateral";
        }
        else if ((a == b) || (b == c) || (a == c)) {
            Type = "Isosceles";
        }
            else
            {
                Type = "Scalene";
            }

        System.out.println("Triangle is " + Type);
    }
}
