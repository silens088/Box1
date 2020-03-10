package SandBox.Magic8game;

import java.io.*;


public class Magic8game {
        //String[] answer = {};

    //метод генерации рандомного числа
    public void randNumb() {
        int randomNumber = (int) (Math.random() * 20 + 1);

        switch (randomNumber) {
            case 1:
                System.out.println("It is certain (Бесспорно)");
                break;
            case 2:
                System.out.println("As I see it, yes (Мне кажется — «да»)");
                break;
            case 3:
                System.out.println("Reply hazy, try again (Пока не ясно, попробуй снова)");
                break;
            case 4:
                System.out.println("Don’t count on it (Даже не думай)");
                break;
            case 5:
                System.out.println(" You may rely on it (Можешь быть уверен в этом)");
                break;
            case 6:
                System.out.println("Yes (Да)");
                break;
            case 7:
                System.out.println("Concentrate and ask again (Сконцентрируйся и спроси опять)");
                break;
            case 8:
                System.out.println("Very doubtful (Весьма сомнительно)");
                break;
            case 9:
                System.out.println("Outlook not so good (Перспективы не очень хорошие)");
                break;
            case 10:
                System.out.println("Cannot predict now (Сейчас нельзя предсказать)");
                break;
            default:
                System.out.println("попробуй снова");
        }
    }


    //свитч кейс, по выбору

    //метод получения строки с вопросом
    public String getString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getStringQuestion = reader.readLine();
        return getStringQuestion;
    }

    public void playBoll() throws IOException {
        System.out.println("Задай свой вопрос: ");
        this.getString();
        this.randNumb();

    }
}
