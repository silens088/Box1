package SandBox.SavingsAccount;

public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    //Check balance:
    public void checkBalance() {
        System.out.println("-----");
        System.out.println("balance is "+ balance);
        System.out.println("-----");
    }

    //Deposit:
    public void deposit(int amountToDeposit) {
        balance = amountToDeposit + balance;
        System.out.println("You just deposited "+amountToDeposit);
    }

    //Withdrawing:
    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew "+amountToWithdraw);
        return amountToWithdraw;
    }

    //описание работы экземпляра
    public String toString() {
        return "Это базовый функционал банковского счета. Он может проверить баланс, внести депозит, внять со счета.";
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        System.out.println(savings);
        savings.checkBalance();
        savings.deposit(500);
        savings.checkBalance();
        savings.withdraw(600);
        savings.checkBalance();
    }
}

