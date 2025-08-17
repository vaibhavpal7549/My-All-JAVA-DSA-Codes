public class QuickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive function
    public static void quickSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }
        // Last element as pivot
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1); // Left
        quickSort(arr, pidx + 1, ei); // Right
    }

    // Partition function
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // To make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot with the correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
