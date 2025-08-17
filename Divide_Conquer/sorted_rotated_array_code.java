public class sorted_rotated_array_code {

    public static int search(int arr[], int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }
        
        //Kaam
        int mid = si + (ei - si)/2;

        //case found
        if(arr[mid] == target){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if((arr[si] <= target) && (target <= arr[mid])){
                return search(arr, target, si, mid-1); // yahan par mid-1 bhi pass kar sakte hain
            } else{
                // case : b right
                return search(arr, target, mid+1, ei);
            }

        }

        //mid on L2
        else{
            // case c : right
            if((arr[mid] <= target) && (target <= arr[ei])){
                return search(arr, target, mid, ei); // yahan par mid+1 bhi pass kar sakte hain
            } else{
                // case d : left
                return search(arr, target, si, mid-1);
            }

        }


    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; //Output 4
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}





/*
public class SortedRotatedArray {
    public static int search(int arr[], int target) {
        int si = 0, ei = arr.length - 1;
        
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            // Check which half is sorted
            if (arr[si] <= arr[mid]) { // Left half is sorted
                if (arr[si] <= target && target < arr[mid]) {
                    ei = mid - 1; // Search in left half
                } else {
                    si = mid + 1; // Search in right half
                }
            } else { // Right half is sorted
                if (arr[mid] < target && target <= arr[ei]) {
                    si = mid + 1; // Search in right half
                } else {
                    ei = mid - 1; // Search in left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // Output: 4
        System.out.println(search(arr, target));
    }
}





 */