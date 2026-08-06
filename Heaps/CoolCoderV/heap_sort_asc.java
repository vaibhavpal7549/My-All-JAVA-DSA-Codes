public class heap_sort_asc {

    public static void heapify(int arr[], int i, int size){
        
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(maxIdx != i){
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            //recursively heapify the affected sub-tree
            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]){
        //Step1: build max heap
        int n = arr.length;
        for(int i = n/2; i >= 0; i--){
            heapify(arr, i, n);
        }
        
        //push largest at the end of the array
        for(int i = n - 1; i >  0; i--){
            //swap (largest) root with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //heapify root element
            heapify(arr, 0, i);
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}


