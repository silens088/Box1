package SandBox.BuildDroid;

public class Droid {

    String name;
    int batteryLevel;

    //constructor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }
//    //constructor type2
//    public Droid(String name0, int batteryLevel0) {
//        this(name0, batteryLevel0 );

    //method 1 : performing a task
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    //method 2 : battery level chek
    public void energyReport() {
        System.out.println(name + " charge left: " + batteryLevel + "%");
    }

    //
    public void energyTransferToMe(Droid nameDroid) {
        batteryLevel = batteryLevel + 10;
        nameDroid.batteryLevel = nameDroid.batteryLevel - 10;
        System.out.println("Get over here!!!");
    }

    //toString info
    public String toString() {
        return "Hello, I’m the droid: " + name;
    }
}
