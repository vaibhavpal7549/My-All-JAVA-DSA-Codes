//In descending order
public class selection{

    public static void selectionSorting(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                // if(arr[minPos] > arr[j]){ //for ascending order
                if(arr[minPos] < arr[j]){ //for descending order
                    minPos = j;
                
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void printf(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        selectionSorting(arr);
        printf(arr);
        

    }
}