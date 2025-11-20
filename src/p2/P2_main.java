package p2;

import java.util.Random;

public class P2_main {
    public static void main(String[] args) {
        int[] numbers = {4,2,3,4,1};
        int max = 100;
        int minIndex = 0;


        max = numbers[0]; // max von Anfang an auf 0.Stelle im Array setzen
        // Testen, ob jede Zelle im Array > max ist. Wenn ja, wird der Wert der Zelle zu max
        // und der Index zu minindex:
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Größter Array-Wert (max): " + max);
        System.out.println("kleinster Index einer Zelle, die den größten Array-Wert beinhaltet (minIndex): " + minIndex);
    }
}
