class Demo{
  protected int price;
  int pid;
}
class Demo1 extends Demo{
  void display(){
    System.out.println(price);
  }
}
class AccessSpecifierDemo{
  public static void main(String args[]){
    Demo1 obj=new Demo1();
    obj.price=100;
    obj.display();
  }
}