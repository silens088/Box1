package SandBox.Calculator3001;
import java.util.Scanner;

//1. ввести 2 числа.
//2. ввести действие: +-*/.

public class Calculator3001 {
    public static void main(String[] args) {
        double num1 = getNumber(); //просим ввести число 1
        double num2 = getNumber(); //просим ввести число 2
        char operation = getOperation(); //просим ввести операция
        double result = calc(num1, num2, operation); //считаем
        System.out.println("Твой результат красавчик:" + result); //выводим результат
    }

    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if(sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
            return getNumber();
        }
    }

    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию:\n 1 - прибавить\n 2 - отнять\n 3 - умножить\n 4 - разделить");
        int operationNumber = 0;
        if(sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double min(double num1, double num2) {
        return num1 - num2;
    }
    public static double mul(double num1, double num2) {
        return num1 * num2;
    }
    public static double div(double num1, double num2) {
        if (num2 !=0.0) {
            return num1 / num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }

    public static double calc(double num1, double num2, char operation) {
        switch(operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return min(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }
}
