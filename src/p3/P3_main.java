package p3;

public class P3_main {
    public static void main(String[] args) {
        int[][] matrix = {  {1,2,3},
                            {4,5,6},
                            {7,8,9}     };

        /* // Operation (a): Erhöhen Sie jedes Element der Matrix um 1 und geben Sie die Matrix aus
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j]++;

                System.out.print(matrix[i][j] + " "); // Array ausgeben
            }
        } */

        // Operation (b): Ermitteln Sie die Summe aller Elemente
        // in der Matrix und geben Sie den Wert auf der Konsole aus
        /* int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Summe aller Elemente in der Matrix: " + sum); */

        /* int[][] b = new int[matrix.length][matrix[0].length]; // neue Matrix b bekommt die gleiche größe wie Originalmatrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                b[j][2 - i] = matrix[i][j]; // Die Spalte in A wird zur Zeile in B -> j
                                            //
            }
        }
         */
        int[][] matrix2 = new int[matrix.length][matrix[0].length]; // neue matrix2 erstellt, gleiche Größe wie matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix2[i][j] = matrix[matrix.length - 1 - j][i]; /* Die Zeilen in matrix2 werden mit den
                                                                     Spalten (rückwärts) in matrix aufgefüllt.
                                                                     Zeile = Spalte rückwärts -> matrix2[i][j] = matrix[2 - i][j] */

                System.out.print(matrix2[i][j] + " "); // Array ausgeben
            }
        }
    }
}
