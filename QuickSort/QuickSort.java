package QuickSort;

public class QuickSort {

    public static void quickSort(int[] vetor, int esquerda, int direita) {
        int i, j, pivo, aux;
        i = esquerda;
        j = direita;

        // Se os dados já estão um pouco ordenados:
        // É melhor começar do meio.
        pivo = vetor[(esquerda + direita) / 2];

        while (i <= j) {
            while (vetor[i] < pivo && i < direita) {
                i++;
            }

            while (vetor[j] > pivo && j > esquerda) {
                j--;
            }

            if (i <= j) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i++;
                j--;
            }
        }

        if (j > esquerda) {
            quickSort(vetor, esquerda, j);
        }

        if (i < direita) {
            quickSort(vetor, i, direita);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 50, 3, 8, 1, 44, 4, 2};
        quickSort(vetor, 0, vetor.length - 1);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}

