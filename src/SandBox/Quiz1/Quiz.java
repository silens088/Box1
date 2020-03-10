package SandBox.Quiz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz {

    static String question1 = "1 Вопрос: Сколько будет 2+3 ?" + "\n" + "Выберите правильный ответ: a = 3, b = 4, c = 5";
    static String question2 = "2 Вопрос: Что такое конкатенация?" + "\n" + "Выберите правильный ответ: a = сцепление обьектов, b = разрыв, c = корея";
    static String question3 = "3 Вопрос: Что такое амальгама?" + "\n" + "Выберите правильный ответ: a = пловец, b = сплав, c = силен";

    static String a = "a";
    static String b = "b";
    static String c = "c";

//    //public static int myTry1() {
//        int myTry1 = 0;  //счетчик
//        //myTry1++;
//        System.out.println("Всего ошибок: " + ++myTry1);
//        return myTry1;
//    }



    public static String getNum1() throws IOException { //получить число от пользователя
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numG;
        while(true)
        {
            numG = reader.readLine();
            System.out.println("Вы ввели: " + numG);
            if (  numG.equals(Quiz.c)) {
                System.out.println("Ответ верный.");
                break;
            } else {
                System.out.println("Ответ не верный, повторите попытку.");
                main.counter++;
                System.out.println("Ошибок: " + main.counter);
            }
        }
        return numG;
    }
    public static String getNum2() throws IOException { //получить число от пользователя
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numG;
        while(true)
        {
            numG = reader.readLine();
            System.out.println("Вы ввели: " + numG);
            if (  numG.equals(Quiz.a)) {
                System.out.println("Ответ верный.");
                break;
            } else {
                System.out.println("Ответ не верный, повторите попытку.");
                main.counter++;
                System.out.println("Ошибок: " + main.counter);
            }
        }
        return numG;
    }
    public static String getNum3() throws IOException { //получить число от пользователя
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numG;
        while(true)
        {
            numG = reader.readLine();
            System.out.println("Вы ввели: " + numG);
            if (  numG.equals(Quiz.b)) {
                System.out.println("Ответ верный.");
                break;
            } else {
                System.out.println("Ответ не верный, повторите попытку.");
                main.counter++;
                System.out.println("Ошибок: " + main.counter);
            }
        }
        return numG;
    }
}
