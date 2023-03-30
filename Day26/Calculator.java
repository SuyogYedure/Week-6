class Calci {
  void add(int a, int b) {
    int res=a+b;
    System.out.println("The sum of two integers is " +res);
  }
  void add(double a, double b) {
    double res=a+b;
    System.out.println("The sum of two double values is " +res);
  }
  void add(int a, int b, long c) {
    long res=a+b+c;
    System.out.println("The sum of two integers and one long value  is " +res);
  }
}
class Calculator{
  public static void main(String args[]){
    Calci obj=new Calci();
    obj.add(10,50);
    obj.add(23.59,89.78);
    obj.add(45,57,569871456);
  }
}