package Class1;

public class ClassElementEx2 {
    static void main() {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고 : " + account.getBalance());
    }
}

class Account {
    private int balance;
    public Account() {
        balance = 0;
    }
    public  int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public  void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액부족");
        }
    }
}