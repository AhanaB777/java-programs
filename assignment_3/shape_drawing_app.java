/* 4. Shape Drawing Application 
Problem Statement: 
A graphics application allows users to draw different shapes like Circles and Rectangles. 
Each shape should: 
- Have a color. 
- Implement a method to calculate area and draw the shape. 
- Circle: Area = π * r² 
- Rectangle: Area = length * breadth 
Define an abstract class Shape with methods calculateArea() and draw(), then 
implement subclasses (Circle, Rectangle). Write a Java program to display the areas and draw shapes. */

package assignment_3;

abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea();

    abstract void draw();
}

class Circle extends Shape {
    double radius;
    double pi = 3.14;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double calculateArea() {
        return pi * radius * radius;
    }

    void draw() {
        System.out.println("Circle drawn of " + color + " color");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    void draw() {
        System.out.println("Rectangle drawn of " + color + " color");
    }
}

public class shape_drawing_app {
    public static void main(String[] args) {
        Shape s1 = new Circle("Green", 7);
        System.out.println("Area of Circle: " + s1.calculateArea());
        s1.draw();

        Shape s2 = new Rectangle("Pink", 4, 3);
        System.out.println("Area of Rectangle: " + s2.calculateArea());
        s2.draw();
    }
}
