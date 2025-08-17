public class find_all_occurrences {

    public static void allOccurrences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i);
        }
        allOccurrences(arr, key, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurrences(arr, key, 0);
    }
}




// import java.util.ArrayList;

// public class FindAllOccurrences {

//     public static ArrayList<Integer> allOccurrences(int arr[], int key) {
//         ArrayList<Integer> indices = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 indices.add(i);
//             }
//         }
//         return indices;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int key = 2;
//         ArrayList<Integer> occurrences = allOccurrences(arr, key);
//         System.out.println("Occurrences of " + key + " found at indices: " + occurrences);
//     }
// }



// public class FindAllOccurrences {
//     public static void allOccurrences(int arr[], int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int key = 2;
//         allOccurrences(arr, key);
//     }
// }



// public class FindAllOccurrences {
//     public static void allOccurrences(int arr[], int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == key) System.out.println(i);
//         }
//     }
// }

