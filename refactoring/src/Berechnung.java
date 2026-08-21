public class Berechnung {
    public static void main(String[] args) {
        int[] l = {4, 8, 15, 16, 23, 42};
        int s = 0;
        for (int i = 0; i < l.length; i++) {
            s = s + l[i];
        }
        double a = (double) s / l.length;
        int mx = l[0];
        for (int i = 0; i < l.length; i++) {
            if (l[i] > mx) {
                mx = l[i];
            }
        }
        int mn = l[0];
        for (int i = 0; i < l.length; i++) {
            if (l[i] < mn) {
                mn = l[i];
            }
        }
        System.out.println("Durchschnitt: " + a);
        System.out.println("Max: " + mx);
        System.out.println("Min: " + mn);
    }
}