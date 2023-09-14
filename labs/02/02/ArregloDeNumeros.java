import java.util.Arrays;
import java.util.Random;

public class ArregloDeNumeros {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 5000, 10000};

        System.out.println("Tamaño del arreglo\tBurbuja\tInserción\tSelección\tMergesort");
        for (int size : sizes) {
            double[] randomArray = generateRandomArray(size);

            double[] bubbleSorted = Arrays.copyOf(randomArray, randomArray.length);
            long bubbleTime = bubbleSort(bubbleSorted);

            double[] insertionSorted = Arrays.copyOf(randomArray, randomArray.length);
            long insertionTime = insertionSort(insertionSorted);

            double[] selectionSorted = Arrays.copyOf(randomArray, randomArray.length);
            long selectionTime = selectionSort(selectionSorted);

            double[] mergeSorted = Arrays.copyOf(randomArray, randomArray.length);
            long mergeTime = mergeSort(mergeSorted, 0, mergeSorted.length - 1);

            System.out.println(size + "\t\t" + bubbleTime + " ms\t" + insertionTime + " ms\t"
                    + selectionTime + " ms\t" + mergeTime + " ms");
        }
    }

    private static double[] generateRandomArray(int size) {
        double[] arr = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble();
        }
        return arr;
    }

    private static long bubbleSort(double[] arr) {
        long startTime = System.currentTimeMillis();
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long insertionSort(double[] arr) {
        long startTime = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long selectionSort(double[] arr) {
        long startTime = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long mergeSort(double[] arr, int left, int right) {
        long startTime = System.currentTimeMillis();
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
