

public class selection_sort {

    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            //swapping karaana hai ab yahan par hamen
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;


        }
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4};
        SelectionSort(arr);

    }
}
