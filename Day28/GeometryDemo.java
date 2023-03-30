interface Shape{
  public void area();
  public void perimeter();
}
class Circle implements Shape{
  public void area(){
    double r = 10;
    double area = 3.14f * r * r;
    System.out.println("Area of Circle is: "+area);
    }
  public void perimeter(){
    double r = 10;
    double perimeter = 2 * 3.14f * r;
    System.out.println("Perimeter of Circle is: "+perimeter);
  }
}
class Rectangle implements Shape{
  public void area(){
    double l = 15, b = 10;
    double area = l * b;
    System.out.println("Area of Rectangle is: "+area);
  }
  public void perimeter(){
    double l = 15, b = 10;
    double perimeter = 2*(l+b);
    System.out.println("Perimeter of Rectangle is: "+perimeter);
  }
}
class Triangle implements Shape{
  public void area(){
    double b = 20, h = 10;
    double area = 0.5f * b * h;
    System.out.println("Area of Triangle is: "+area);
  }
  public void perimeter(){
    double b = 20, h = 10, a = 5;
    double perimeter = b + h + a;
    System.out.println("Perimeter of Triangle is: "+perimeter);
  }
}
class GeometryDemo{
  public static void main(String args[]){
    Shape rect = new Rectangle();
    Shape cir = new Circle();
    Shape tri = new Triangle();
    rect.area();
    rect.perimeter();
    cir.area();
    cir.perimeter();
    tri.area();
    tri.perimeter();
  }
}