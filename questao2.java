import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stop = 1, recebeArray;
        ArrayList<Integer> num = new ArrayList<Integer>();

        do {
            System.out.println("'0' para finalizar o programa\nDigite um numero> ");
            stop = scan.nextInt();
            if (stop != 0) {
                num.add(stop);
            }
        } while (stop != 0);

        int[] numero = new int[num.size()];

        for (int i = 0; i < num.size(); i++) {
            numero[i] = num.get(i);
        }
        System.out.println("Números não ordenados");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
        Arrays.sort(numero);
        System.out.println("\nNúmeros pares ordenados");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i]);
            }
        }
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("\nNúmeros impares ordenados");
        for (int i = 0; i < numero.length; i++) {
            if (num.get(i) % 2 != 0) {
                System.out.println(num.get(i));
            }
        }

    }
}
