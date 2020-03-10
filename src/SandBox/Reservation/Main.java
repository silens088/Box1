package SandBox.Reservation;

public class Main {
    public static void main(String[] args) {
        // Create instances here
        Reservation table1 = new Reservation(4, 6, false);

        table1.confirmReservation();
        table1.informUser();
    }
}
