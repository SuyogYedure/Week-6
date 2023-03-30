class Shape {
  public void area(float w, float l) {
    float area = w * l;
    System.out.println("Area is " + area);
  }
  public void area(float r) {
    float area = 3.14f * r * r;
    System.out.println("Area is " + area);
  }
  public void area(double a) {
    double area = a * a;
    System.out.println("Area is " + area);
  }
}
class ShapeDemo {
  public static void main(String[] args) {
    Shape obj = new Shape();
    obj.area(7,9);
    obj.area(5.2);
    obj.area(8.9);
  }
}