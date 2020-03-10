package SandBox.HeadFirstJava.g10;

public class PlayerTestDriver {
    public static void main(String[] args) {
        //System.out.println(Player.playerCount);
        Player one = new Player("Fil Jonson");
        Player two = new Player("Black guy", 1);

        System.out.println("Всего создано игроков: " + Player.playerCount);

        one.sayWhite();
        two.sayBlack();
        Player one2 = new Player("Garry topor");
        one2.allFuck("Вот дерьмо! что это за детсад? Я вас всех разьебу!");

        System.out.println("Всего создано игроков: " + Player.playerCount);

        Player three = new Player(180);
        System.out.println("Длина члена = " + three.lengthDick);
    }
}
