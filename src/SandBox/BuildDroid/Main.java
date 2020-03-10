package SandBox.BuildDroid;

public class Main {
    public static void main(String[] args) {

        Droid codey = new Droid("Codeyy");
        Droid codey2 = new Droid("Bendor");

        System.out.println(codey);
        System.out.println(codey2);

        codey.performTask("kill all...");
        codey.energyReport();

        codey2.performTask("Play games...");
        codey2.energyReport();

        codey.energyTransferToMe(codey2);
        codey.energyTransferToMe(codey2);
        codey.energyTransferToMe(codey2);
        codey.energyTransferToMe(codey2);
        codey.energyReport();
        codey2.energyReport();

    }
}
