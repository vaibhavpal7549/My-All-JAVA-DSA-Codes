import java.util.ArrayList;

public class pairsum_1optimal {

    public static boolean pairSum(ArrayList<Integer> list, int target, int lp, int rp) {

        while(lp<rp){
            int sum = list.get(lp)+list.get(rp);
            //case 1
            if(sum==target){
                return true;
                //case 2
            }else if(sum <target){
                lp++;
            }else{ //case 3
                rp--;
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
        int lp = 0, rp = height.size() - 1;
        System.out.println(pairSum(height, target, lp, rp));
    }
}
