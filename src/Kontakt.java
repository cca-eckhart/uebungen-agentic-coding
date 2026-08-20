// Kontakt.java
public class Kontakt {
    private String name;
    private String telefonnummer;

    public Kontakt(String name, String telefonnummer) {
        this.name = name;
        this.telefonnummer = telefonnummer;
    }

    public String getName() {
        return name;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    @Override
    public String toString() {
        return name + ": " + telefonnummer;
    }
}