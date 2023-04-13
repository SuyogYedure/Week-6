class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 20000;

    void withdrawAmount(double amount) throws InsufficientFundsException {
        if (amount >= 100 && amount % 100 == 0) {
            if (amount > balance) {
                balance = balance - amount;
                System.out.println("withdraw Success");
            } else {
                throw new InsufficientFundsException("Invalid Amount ! insufficient balance");
            }
        } else {
            throw new InsufficientFundsException("Invalid Amount ! Amount must be multiple of hundreds");
        }
    }

    void depositAmount(double amount) {
        balance = balance + amount;
    }

    void checkBalance() {
        System.out.println("Available balance is : " + balance);
    }
}

class BankDemo {
    public static void main(String args[]) {
        BankAccount bank = new BankAccount();
        try {
            bank.withdrawAmount(2500);
        } catch (InvalidAmountException e) {
            System.out.println(e);
        }
        bank.checkBalance();
        bank.depositAmount(5000);
    }
}