import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, startUp = 10, total;
        Scanner kilometre = new Scanner(System.in);
        System.out.print("Mesafe Kaç Kilometre?");
        km = kilometre.nextInt();
        total = km * perKm + startUp;
        total = (total < 20) ? 20 : total;
        System.out.println("Tutarınız: " + total);

    }
}
