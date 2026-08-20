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
}