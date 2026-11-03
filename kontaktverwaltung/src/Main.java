// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kontaktverwaltung verwaltung = new Kontaktverwaltung();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Kontaktverwaltung ---");
            System.out.println("1 - Kontakt hinzufuegen");
            System.out.println("2 - Alle Kontakte anzeigen");
            System.out.println("0 - Beenden");
            System.out.print("Auswahl: ");

            String auswahl = scanner.nextLine().trim();

            switch (auswahl) {
                case "1":
                    System.out.print("Name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Telefonnummer: ");
                    String telefonnummer = scanner.nextLine().trim();

                    verwaltung.hinzufuegen(new Kontakt(name, telefonnummer));
                    System.out.println("Kontakt wurde hinzugefuegt.");
                    break;

                case "2":
                    System.out.println("\nAlle Kontakte:");
                    verwaltung.alleAnzeigen();
                    break;

                case "0":
                    running = false;
                    System.out.println("Programm wird beendet.");
                    break;

                default:
                    System.out.println("Ungueltige Auswahl. Bitte erneut versuchen.");
            }
        }

        scanner.close();
    }
}