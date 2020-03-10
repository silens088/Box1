package SandBox.HeadFirstJava.g10;

public class StaticInitializeTest {
    //public static final int FOO_X = 25;
    public static final double BAR_SING;

    static {
        BAR_SING = (double) Math.random();
    }



    public static void main(String[] args) {
        System.out.println(BAR_SING);
    }


}
