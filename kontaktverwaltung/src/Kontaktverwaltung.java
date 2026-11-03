// Kontaktverwaltung.java
import java.util.ArrayList;
import java.util.List;

public class Kontaktverwaltung {
    private List<Kontakt> kontakte = new ArrayList<>();

    public void hinzufuegen(Kontakt k) {
        kontakte.add(k);
    }

    public void alleAnzeigen() {
        for (Kontakt k : kontakte) {
            System.out.println(k);
        }
    }

    public List<Kontakt> suchen(String suchbegriff) {
        List<Kontakt> ergebnisse = new ArrayList<>();
        if (suchbegriff == null || suchbegriff.trim().isEmpty()) {
            return ergebnisse;
        }
        for (Kontakt k : kontakte) {
            if (k.getName().toLowerCase().contains(suchbegriff.toLowerCase().trim())) {
                ergebnisse.add(k);
            }
        }
        return ergebnisse;
    }
}