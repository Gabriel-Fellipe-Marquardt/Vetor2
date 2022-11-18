import java.util.Random;

public class questao3 {
    public static void main(String[] args) {
        Random ran = new Random();
        int somaMatriz;
        int[][] matriz = new int[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ran.nextInt(5) + 1;
            }
        }

        int[] soma = new int[matriz.length];
        int[][] multiplicacao = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma[i] += matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                multiplicacao[i][j] = soma[i] * matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Coluna: " + i + " linha: " + j + " = " + matriz[i][j]);
                System.out.println("Soma: " + soma[i]);
                System.out.println("Multiplicação: " + multiplicacao[i][j]);
                System.out.println("====================================");
            }
        }
    }
}
