

public class last_occurrence {

    public static int LastO(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound =  LastO(arr, key, i+1);
        if(isFound == -1 && arr[i] ==key){
            return i;
        }
        return isFound;

    }


    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        int i = 0;
        System.out.println(LastO(arr, key, i));
    }
}
