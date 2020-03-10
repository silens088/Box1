package SandBox.HeadFirstJava.g10;

public class Player {
    static int playerCount = 0;
    private String name;
    int lengthDick;

    public void sayWhite() {
        System.out.println("i`m white man!");
    }
    public void sayBlack() {
        System.out.println("i`m NIGGA BLACK man!");
    }
    public void allFuck(String allText) {
        System.out.println(allText);
    }

    //constructor method
    public Player(String string) { //конструктор на экземпляр
        name = string;
        playerCount++;
        System.out.println("Вот дерьмо! Кто это?");
    }

    public Player(String num1, int x) {
        name = num1;
        playerCount++;
    }

    public Player(int DicLong) {
        lengthDick = DicLong;
    }
}
