package SandBox.TransitCalculator;

public class TransitCalculator {

    String[] priceOptions = {"Pay-per-ride", "7-day", "30-day"};
    double[] price = {2.75, 33.00, 127.00};

    int rides;  //поле для количества отдельных
    int days;    //поле для количества дней

    //конструктор (почему public?)
    TransitCalculator(int ridesNum, int dayNum) {

        rides = ridesNum;
        days = dayNum;

    }

    //считает цену за тариф 7
    double unlimited7Price() {

        double week = Math.ceil(days / 7.0);
        double totalCost7Day = week * price[1] ;

        return totalCost7Day / rides;
    }
    //считает цену за тариф 30 (после теста вернуть)
//    double unlimited30Price(double rides, double day) {
//        double prise = Math.ceil(127.00 / day);
//        return prise;
//    }
    //получить массив с общей ценой
    double[] getRidePrices() {
//        //мой код
//        double a1 = 2.27;
//        double a2 = unlimited7Price(rides, day);
//        double a3 = unlimited30Price(rides, day);
//        double[] allPriseArray = {a1, a2, a3};
        double price1 = price[1];
        double unlimited7Price = unlimited7Price();
        double unlimited30Price = price[2] / rides;

        double[] allPriseArray = {price1, unlimited7Price, unlimited30Price};
        return allPriseArray;
    }
    //рассчитать лучший тариф
    String getBestFare() {
//        //оставить на память
//        double[] arrayPrise = getRidePrices(rides, day);
//        for (int i = 0; i < arrayPrise.length; i++) {
//            if (arrayPrise[0] < arrayPrise[i] && arrayPrise[0] < arrayPrise[2]) {
//                return "You should get the " + priceOptions[0] + " option at $" + price[0] + " per ride.";
//            } else if (arrayPrise[1] < arrayPrise[0] && arrayPrise[1] < arrayPrise[2]) {
//                return "You should get the " + priceOptions[1] + " option at $" + price[1] + " per ride.";
//            }
//        }
//        return "You should get the " + priceOptions[3] + " option at $" + price[3] + " per ride.";
        //помещаем массив getRidePrices в новый массив priceRide
        double[] priceRide = getRidePrices();
        //индекс лучшего предложения
        int winIndex = 0;

        //цикл выбора победителя
        for (int i = 0; i < priceRide.length; i++) {
            if (priceRide[i] < priceRide[winIndex]) {
                winIndex = i;
            }
        }
        return "You should get the " + priceOptions[winIndex] + " option at $" + Math.round(priceRide[winIndex] * 100.0) / 100.0 + " per ride.";

    }

    public static void main(String[] args) {
        TransitCalculator transCalc = new TransitCalculator(44, 30);
        System.out.println(transCalc.getBestFare());

    }
}



