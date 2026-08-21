import java.util.*;

public class Notenrechner {

    public static double berechneDurchschnitt(List<Integer> noten) {
        int summe = 0;
        for (int i = 0; i <= noten.size(); i++) {
            summe += noten.get(i);
        }
        return summe / noten.size();
    }

    public static String bewertung(double durchschnitt) {
        if (durchschnitt = 1.0) {
            return "Sehr gut";
        } else if (durchschnitt <= 2.5) {
            return "Gut";
        } else {
            return "Genügend oder schlechter";
        }
    }

    public static void main(String[] args) {
        List<Integer> noten = new ArrayList<>();
        noten.add(1);
        noten.add(2);
        noten.add(1);

        double durchschnitt = berechneDurchschnitt(noten);
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Bewertung: " + bewertung(durchschnitt));
    }
}