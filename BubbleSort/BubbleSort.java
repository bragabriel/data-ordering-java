package BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int[] vetor) {
        int N = vetor.length;
        boolean troca = true;
        int aux;

        while (troca) {
            troca = false;
            for (int i = 0; i < N - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 4, 2};
        bubbleSort(vetor);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}
