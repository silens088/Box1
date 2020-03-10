package SandBox.Quiz1;

import java.io.IOException;

public class main {
    public static int counter = 0;

    public static void main(String[] args) throws IOException {

        System.out.println(Quiz.question1);
        Quiz.getNum1(); //метод получения буквы ответа.

        System.out.println(Quiz.question2);
        Quiz.getNum2(); //метод получения буквы ответа.

        System.out.println(Quiz.question3);
        Quiz.getNum3(); //метод получения буквы ответа.

        System.out.println("Тест завершен." + "\n" + "Ошибок: " + counter);
        System.out.println("Ваша оценка: хорошо");












    }

}
