package SandBox.SeaWar;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>(); //arraylist только для обьектов DotCom.
    private int numOfGuesses = 0;

    private void setUpGame() {
//создадим несколько сайтов и присвоим им адреса/имена/помещаем в ArrayList
        DotCom one =  new DotCom();
        one.setName("Сайт 1");
        DotCom two = new DotCom();
        two.setName("Сайт 2");
        DotCom three = new DotCom();
        three.setName("Сайт 3");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
//выводим краткие инструкции
        System.out.println("Ваша цель потопить три сайта");
        System.out.println("Сайт 1, 2, 3");
        System.out.println("Потопите за минимальное кол-во ходов");

        for(DotCom dotComToSet : dotComsList) { //повторяем каждый обьект DotCom в списке
            ArrayList<String> newLocation = helper.placeDotCom(3); //запрашиваем у вспомогательного обьекта адрес сайта.

            dotComToSet.setLocationCells(newLocation); //вызываем сеттер из обьекта DotCom, чтобы передать ему местоположение которое только что получили от вспомогательного обьекта.
        }
    }
    private void startPlaying() {
        while (!dotComsList.isEmpty()) { //до тех пор пока список обьектов не станет пустым.
            String userGuess = helper.getUserInput("Сделайте ход"); //получаем пользовательский ввод.
            checkUserGuess(userGuess); //вызываем метод
        }
        finishGame(); //вызываем метод финиш гейм.
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;

        String result = "мимо"; //подразумеваем промах пока не выяснили обратного

        for (DotCom dotComToTest : dotComsList) { //повторяем это для всех обьектов DotCom в списке
            result = dotComToTest.checkYourself(userGuess); //просим DotCom проверить ход пользователя ищем попадание или потопление
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest); //сайт потоплен, убираем его из списка сайтов и выходим из цикла.
                break;
            }
        }
        System.out.println(result); //выводим результат
    }
    private void finishGame() {
        System.out.println("Все сайты потоплены");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло: " + numOfGuesses + " попыток.");
            System.out.println("вы не утонули =)");
        } else {
            System.out.println("Это заняло много времени. " + numOfGuesses + " попыток.");
            System.out.println("вы утонули =(");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust(); //создаем игровой обьект
        game.setUpGame(); //говорим игровому обьекту подготовить игру.
        game.startPlaying(); //говорим игровому обьекту начать главный игровой цикл.
    }
}
