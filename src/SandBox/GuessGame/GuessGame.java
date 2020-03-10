package SandBox.GuessGame;

public class GuessGame {
    Player p1; //три переменных экземпляра для трех обьектов player
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player(); //создаем три обьекта player и присваиваем их трем переменным экземпляра.
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; // объявляем при переменные для хранения вариантов от каждого игрока.
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; //объявляем при меременные для хранения правильности или неправильности ответов игроков.
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);      //создаем число которое должны угадать
        System.out.println("Я загадываю число от 0 до 9...");

        while(true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            p1.guess(); //Вызываем метод guess из каждого обьекта player
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает что это" + guessp1);  // извлекаем результаты работы методов guess() получая доступ к их переменным number
            guessp2 = p2.number;
            System.out.println("Второй игрок думает что это" + guessp2);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает что это" + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("we have a winner!");
                System.out.println("First player guessed right?" + p1isRight);
                System.out.println("second player guessed right?" + p2isRight);
                System.out.println("third player guessed right?" + p3isRight);
                System.out.println("Game over");
                break; //игра окончена, прерываем цикл.
            } else {
                System.out.println("нет победителя! продолжаем игру!");
            }

        } //конец цикла
    } //конец метода
} //конец класса
