// Insertion Sort in Descending Order
public class InsertionSortDescending {

    public static void insertionSorting(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;  // Store index, not value

            // Find the correct position for 'curr'
            while (prev >= 0 && arr[prev] < curr) {  // Descending Order
                arr[prev + 1] = arr[prev];  // Shift elements to the right
                prev--;
            }
            arr[prev + 1] = curr;  // Insert at the correct position
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        insertionSorting(arr);
        printArray(arr);
    }
}
