import java.util.ArrayList;

public class pairSum_1 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }

        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 2 3 4 5 6 
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        
        
        int target = 5;
        System.out.println(pairSum(height, target));
    }
}
