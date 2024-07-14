package InsertSort;

public class InsertSort {

    public static void insertSort(int[] vetor) {
        int N = vetor.length;
        int aux, j;

        for (int i = 1; i < N; i++) {
            aux = vetor[i];
            for (j = i - 1; (j >= 0) && (aux < vetor[j]); j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = aux;
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 4, 2};
        insertSort(vetor);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}

