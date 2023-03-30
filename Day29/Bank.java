class InsufficientFundsException extends Exception{
  InsufficientFundsException(String str){
    super(str);
  }
}
class BankAccount{
  int balance=10000;
  void deposit(int amount){
    balance=balance+amount;
    System.out.println("Balance is:"+balance);
  }
  void checkBalance(){
    System.out.println("Balance is:"+balance);
  }
  void withdraw(int amount) throws InsufficientFundsException{
    if(amount>balance){
      throw new InsufficientFundsException("Insuffiecient balance");
    }
    else{
      balance=balance-amount;
      System.out.println("Balance is:"+balance);
    }
  }
}
class Bank{
  public static void main(String args[]){
    BankAccount obj=new BankAccount();
    obj.deposit(2000);
    obj.checkBalance();
    try{
      b.withdraw(2000);
    }
    catch(InsufficientFundsException e){
      System.out.println(e);
    }
  }
}