interface Shape{
  void draw();
}
class Rectangle implements Shape{
  public void draw(){
    System.out.println("Rectangle");
  }
}
class Circle implements Shape{
  public void draw(){
    System.out.println("Circle");
  }
}
  class InterfaceDemo{
    public static void main(String args[]){
      Shape obj=new Rectangle();
      Shape c = new Circle();
      c.draw();
      obj.draw();
    }
}