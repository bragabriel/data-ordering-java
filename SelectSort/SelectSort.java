package SelectSort;

public class SelectSort {

    public static void selectSort(int[] vetor) {
        int N = vetor.length;
        int menor, aux;

        for (int i = 0; i < N - 1; i++) {
            menor = i;
            for (int j = i + 1; j < N; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                aux = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = aux;
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 3, 8, 4, 2};
        selectSort(vetor);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}

