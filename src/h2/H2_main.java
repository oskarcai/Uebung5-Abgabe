package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int n = 299;
        int digits = 3;
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        // Array mit Nullen auffüllen:
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }

        String int_convert = "" + n; // int in String umwandeln
        digits = int_convert.length(); // Länge des Strings in int digits speichern

        System.out.println("Zahl " + n + " hat " + digits + " Ziffern!");

        // int n in Array-Zellen speichern:
        for (int i = 0; i < a.length; i++) {
            a[a.length - 1 - i] = n % 10;   // letzte Ziffer vom int n in Array-Index (von rechts ausgehend) speichern
            n /= 10;                        // letzte Ziffer vom int n abschneiden
        }

        // Array ausgeben:
        System.out.println( Arrays.toString(a) );
    }
}
