package SandBox.LoanPaymentCalculator;

/*
program that will calculate the monthly car payment
a user should expect to make after taking out a car loan.
*/

public class LoanPaymentCalculator {
    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if (loanLength <= 0 && interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan. Вы должны взять действующий автокредит.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full. Автомобиль можно оплатить полностью!");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = 12;
            int monthlyBalance = remainingBalance/months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = (monthlyBalance + interest) / 3;
            System.out.println(monthlyPayment);
        }






    }
}
