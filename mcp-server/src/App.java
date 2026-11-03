import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {

    // Verbindungsparameter (anpassen)
    private static final String URL = "jdbc:mysql://localhost:3306/game_db?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        System.out.println("Verbinde mit MySQL...");

        // 1. Neuen Score eintragen (INSERT)
        addScore("Alex", 1250);
        addScore("Paul", 850);

        // 2. Bestenliste abfragen und ausgeben (SELECT)
        showHighscores();
    }

    public static void addScore(String name, int score) {
        String sql = "INSERT INTO highscores (player_name, score) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setInt(2, score);
            stmt.executeUpdate();

            System.out.println("Score für " + name + " (" + score + " Punkte) gespeichert!");

        } catch (Exception e) {
            System.err.println("Fehler beim Einfügen: " + e.getMessage());
        }
    }

    public static void showHighscores() {
        String sql = "SELECT player_name, score FROM highscores ORDER BY score DESC LIMIT 5";

        System.out.println("\n --- TOP 5 HIGHSCORES ---");
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            int rank = 1;
            while (rs.next()) {
                String name = rs.getString("player_name");
                int score = rs.getInt("score");
                System.out.println(rank + ". Platz: " + name + " - " + score + " Pkt.");
                rank++;
            }

        } catch (Exception e) {
            System.err.println("Fehler beim Laden: " + e.getMessage());
        }
    }
}