import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, k, somaPesos = 0;

        System.out.println("Quantos alunos tem na classe: ");
        n = scan.nextInt();
        double mediaPonderada[] = new double[n];

        System.out.println("Quantas Provas cada aluno Realizará? ");
        k = scan.nextInt();
        double nota[] = new double[k];
        int[] peso = new int[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Qual o peso Da prova [" + (i + 1) + "]:");
            peso[i] = scan.nextInt();
            somaPesos += peso[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.println("Qual nota o aluno [" + (j + 1) + "] tirou na prova [" + (i + 1) + "]");
                nota[j] = scan.nextDouble();
                mediaPonderada[i] += (nota[j] * peso[j]) / somaPesos;

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println("A média ponderada do aluno [" + (i + 1) + "] foi : " + mediaPonderada[i]);
        }
    }

}
