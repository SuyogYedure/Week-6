import java.util.Scanner;
interface ATM {
  void deposit();
  void withdraw();
  void getBalance();
}
class SBI implements ATM {
  Scanner s = new Scanner(System.in);
  double bal = 10000;
  public void deposit() {
    System.out.println("Enter deposit amount ");
    double amt = s.nextDouble();
    bal = bal + amt;
    getBalance();
  }
  public void withdraw() {
    System.out.println("Enter withdraw amount ");
    double amt = s.nextDouble();
    bal = bal - amt;
    getBalance();
  }
  public void getBalance() {
    System.out.println("Available balance is " + bal);
  }
}
class AtmDemo{
  public static void main(String args[]) {
    ATM atm = new SBI();
    atm.deposit();
    atm.withdraw();
    atm.getBalance();
  }
}