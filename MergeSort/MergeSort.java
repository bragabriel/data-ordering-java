package MergeSort;

public class MergeSort {

    public static void merge(int[] vetor, int n) {
        int i, j, k, meio;
        int[] vetorAux = new int[n];

        meio = n / 2;
        i = 0;
        j = meio;
        k = 0;

        while (i < meio && j < n) {
            if (vetor[i] <= vetor[j]) {
                vetorAux[k] = vetor[i];
                k++;
                i++;
            } else {
                vetorAux[k] = vetor[j];
                k++;
                j++;
            }
        }

        // Se estiver sobrando elemento do lado direito
        if (i == meio) {
            while (j < n) {
                vetorAux[k] = vetor[j];
                k++;
                j++;
            }
        }
        // Se não, vai sobrar elemento do lado esquerdo
        else {
            while (i < meio) {
                vetorAux[k] = vetor[i];
                k++;
                i++;
            }
        }

        // Volta tudo do Aux para o original.
        System.arraycopy(vetorAux, 0, vetor, 0, n);
    }

    public static void mergeSort(int[] vetor, int n) {
        if (n > 1) {
            int meio = n / 2;

            int[] left = new int[meio];
            int[] right = new int[n - meio];

            System.arraycopy(vetor, 0, left, 0, meio);
            System.arraycopy(vetor, meio, right, 0, n - meio);

            mergeSort(left, meio);
            mergeSort(right, n - meio);

            System.arraycopy(left, 0, vetor, 0, meio);
            System.arraycopy(right, 0, vetor, meio, n - meio);

            merge(vetor, n);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {5, 44, 3, 50, 8, 4, 2};
        mergeSort(vetor, vetor.length);
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }
}

