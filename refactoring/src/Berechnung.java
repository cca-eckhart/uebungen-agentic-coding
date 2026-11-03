import java.util.Arrays;

public class Berechnung {
    public static void main(String[] args) {
        int[] zahlen = {4, 8, 15, 16, 23, 42};

        // Kennzahlen mit Standardfunktionen aus der Java-Bibliothek berechnen.
        int summe = Arrays.stream(zahlen).sum();
        double durchschnitt = (double) summe / zahlen.length;
        int maximum = Arrays.stream(zahlen).max().getAsInt();
        int minimum = Arrays.stream(zahlen).min().getAsInt();

        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Max: " + maximum);
        System.out.println("Min: " + minimum);
    }
}