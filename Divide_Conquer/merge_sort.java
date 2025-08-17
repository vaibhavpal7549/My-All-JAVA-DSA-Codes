public class merge_sort {

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
        // Base case
        if(si >= ei){
            return;
        }
        // Mid
        int mid = si + (ei - si)/2;
        // Recursive calls //kaam
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        // Merge
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        // Create a temporary array
        int temp[] = new int[ei - si + 1];
        // Pointers
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part

        int k = 0; //iterator for temp array
        // Merge the two arrays
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // Copy the remaining elements
        // Left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // Right part
        while(j <= ei){
            temp[k++] = arr[j++];

        }  
        // ✅ Copy sorted elements back to the original array
        for (int x = 0; x < temp.length; x++) {
            arr[si + x] = temp[x];
        }


    }


    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
