// public class bubble_sort {

//     public static void bubbleSort(int arr[]){
//         for(int turn = 0; turn < arr.length-1; turn++){
//             // 0 to 3 turns = 4 turns
//             // inner loop
//             for(int j = 0; j < arr.length - 1 - turn; j++){
//                 if(arr[j]> arr[j+1]){
//                     //swap
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]){
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }


//     public static void main(String[] args) {
//         int arr[] = {5,4,3,2,1};
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }





public class bubble_sort {

    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            // 0 to 3 turns = 4 turns
            // inner loop

            int swaps = 0;
            for(int j = 0; j < arr.length - 1 - turn; j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
    }
}
