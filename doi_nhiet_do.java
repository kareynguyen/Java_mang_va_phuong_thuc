import java.util.Scanner;

public class doi_nhiet_do {
    public static double fahToCel(double fah) {
        double cel = (5.0 / 9) * fah - 32;
        return cel;
    }

    public static double celToFah(double cel) {
        double fah = (9.0 / 5) * cel + 32;
        return fah;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Fah to Cel");
            System.out.println("2. Cel to Fah");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fah: ");
                    double fah = sc.nextDouble();
                    System.out.println("Cel is: " + fahToCel(fah));
                case 2:
                    System.out.println("Enter Cel: ");
                    double cel = sc.nextDouble();
                    System.out.println("Fah is: " + celToFah(cel));
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
