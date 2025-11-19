package h3;

public class H3_main {
    public static void main(String[] args) {
        int[][] einheiten = new int[2][15];
        einheiten = new int[][]{{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} };
        int input = 6279; // Geldbetrag in Cent

        // int input in Array-Zellen aufsplitten:
        for(int i = 0; i < einheiten[0].length; i++) {
            einheiten[1][i] = input / einheiten[0][i];
                input = input % (einheiten[0][i]);
        }

        // Array-Ausgabe:
        for(int i = 0; i < einheiten[0].length; i++) {
            System.out.print(einheiten[1][i]  + " ");
        }
    }
}
