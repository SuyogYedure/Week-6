interface Operation{
  void add();
  void sub();
  void mul();
  void div();
}
class Calculator implements Operation{
  public void add(){
    int a=125,b=201;
    System.out.println((a+b));
  }
  public void sub(){
    int a=125,b=201;
    System.out.println((a-b));
  }
  public void mul(){
    int a=125,b=201;
    System.out.println((a*b));
  }
  public void div(){
    int a=125,b=201;
    System.out.println((a/b));
  }
}
class OperationDemo{
  public static void main(String args[]){
    Operation opt=new Calculator();
    opt.add();
    opt.sub();
    opt.mul();
    opt.div();
  }
}

