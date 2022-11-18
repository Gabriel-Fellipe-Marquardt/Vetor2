import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int notas[] = new int[10];
        int maiorNota = 0;
        int media = 0, i;
        int contador = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Qual a nota do aluno " + i);
            notas[i] = scan.nextInt();
            media += notas[i];
            if (maiorNota < notas[i]) {
                maiorNota = notas[i];
            }
        }
        media = media / 10;
        for (i = 0; i < 10; i++) {
            if (media > notas[i]) {
                contador++;
            }
        }
        System.out.println("A média da turma foi " + media);
        System.out.println("A quantidade de alunos acima da média da turma é de " + contador);
        System.out.println("A maior nota da turma é " + maiorNota + " e aparece na posição " + i + " do vetor");

    }

}
