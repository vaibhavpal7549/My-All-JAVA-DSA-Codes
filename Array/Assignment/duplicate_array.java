
public class duplicate_array{

    public static boolean dup(int arr[]){

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] main){

        int nums[] = {1,2,3,1};

        boolean ans = dup(nums);


        System.out.println(ans);


    }
}