package p1;

public class P1_main {
    public static void main(String[] args) {
        System.out.println("Mit der while-Schleife: ");

        // while-Schleife:
        int x = 0;
        while(x <= 10) {
            x = x + 1;
            System.out.println(x);
        }

        System.out.println(" ");
        System.out.println("Mit der for-Schleife ");

        // for-Schleife, welche den gleichen Output wie die while-Schleife (s.o.) gibt:
        for(int i = 1; i <= 11; i++) {
            System.out.println(i);
        }

        System.out.println(" ");
        System.out.println("Mit der do-while-Schleife: ");

        // do-while-Schleife, welche den gleichen Output wie die while-Schleife (s.o.) gibt:
        int y = 0;
        do {
            y++;
            System.out.println(y);
        } while(y <= 10);
    }
}
