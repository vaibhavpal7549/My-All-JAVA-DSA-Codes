import java.util.ArrayList;

public class pairsum_2optimal {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        //O(n) Time Complexity
        //For bruteforce approach follow old one solution of the pairsum1
        // breakpoint here
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >list.get(i+1)){//breaking point
                bp = i;
                break;

            }
        }

        //We have to use modulo arithmetic , which helps in the sorted and rotated
        int lp = bp + 1; //smallest
        int rp = bp; //largest
        while(lp != rp){
            int sum = list.get(lp) + list.get(rp);
            //case 1
            if(sum == target){
                return true;
            }else if(sum<target){ //case 2
                lp = (lp+1) % n;
            }else{ //case 3
                rp = (n+rp-1) % n;
            }
        }
        return false;


    }


    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1 2 3 4 5 6 
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        
        int target = 16;

        System.out.println(pairSum(height, target));
    }
}
