abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double calculateArea(){
      int r = 10;
      double area = 2*3.142*r*r;
      return area;
    }
}

class Rectangle extends Shape {
    double calculateArea(){
      int l = 15, b = 25;
      double area = l*b;
      return area;
    }
}
class ShapeDemo{
  public static void main(String args[]){
    Shape c = new Circle();
    Shape r = new Rectangle();
    System.out.println(c.calculateArea());
    System.out.println(r.calculateArea());
  }
}
