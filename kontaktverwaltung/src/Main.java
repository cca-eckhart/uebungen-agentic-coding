// Main.java
public class Main {
    public static void main(String[] args) {
        Kontaktverwaltung verwaltung = new Kontaktverwaltung();
        verwaltung.hinzufuegen(new Kontakt("Anna Muster", "0664 1234567"));
        verwaltung.hinzufuegen(new Kontakt("Ben Beispiel", "0660 7654321"));
        verwaltung.alleAnzeigen();
    }
}