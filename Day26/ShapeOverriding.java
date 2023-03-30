import java.util.Scanner;
class Shape {
  Scanner s = new Scanner(System.in);
  double getArea() {
    return 0.0;
  }
}
class Circle extends Shape {
  Scanner s = new Scanner(System.in);
  double getArea() {
    System.out.println("Enter the radius of the circle");
    double r = s.nextDouble();
    double area = 3.14f * r * r;
    return area;
  }
}
class Rectangle extends Shape {
  double getArea() {
    System.out.println("Enter the length of the rectangle");
    double l = s.nextDouble();
    System.out.println("Enter the width of the rectangle");
    double w = s.nextDouble();
    double area = l * w;
    return area;
  }
}
class ShapeOverriding {
  public static void main(String args[]) {
    Circle obj = new Circle();
    System.out.println("Area of the cicle is " + obj.getArea());
    Rectangle rect = new Rectangle();
    System.out.println("Area of the rectangle is " + rect.getArea());
  }
}