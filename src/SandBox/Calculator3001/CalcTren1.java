package SandBox.Calculator3001;

import java.util.Scanner;

public class CalcTren1 {
    public static void main(String[] args) {
        double number1 = getNum(); //get num 1
        double number2 = getNum(); //get num 2
        char operation = getOper(); //get oper
        double answer = calcul(number1, number2, operation);
        System.out.println("Your answer: " + answer);

    }
    public static double getNum() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("write number: ");
        if (scan1.hasNextDouble()) {
            return (scan1.nextDouble());
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод.");
            return getNum();
        }
    }

    public static char getOper() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Выберите операцию: + - / *");
        String operationType = "";
        if (scan2.hasNextLine()) {
            operationType = scan2.nextLine();
        } else {
            System.out.println("Вы ввели не символ. Повторите ввод: ");
            return getOper();
        }
        switch (operationType) {
            case "+":
                return '+';
            case "-":
                return '-';
            case "*":
            case "/":
                return operationType.charAt(0);
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOper();
        }



        }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }
    public static double minys(double number1, double number2) {
        return number1 - number2;
    }
    public static double mylt(double number1, double number2) {
        return number1 * number2;
    }
    public static double divide(double number1, double number2) {
        if (number2 !=0.0) {
            return number1 / number2;
        } else {
            System.out.println("На ноль делить нельзя");
            return Double.NaN;
        }
    }

    public static double calcul(double number1, double number2, char operation) {
        switch(operation) {
            case '+':
                return add(number1, number2);
            case '-':
                return minys(number1, number2);
            case '*':
                return mylt(number1, number2);
            case '/':
                return divide(number1, number2);
            default:
                return Double.NaN;
        }
    }
}
