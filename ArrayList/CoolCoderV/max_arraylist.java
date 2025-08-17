import java.util.ArrayList;
public class max_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Adding Elements
        //Linear Time Complexity o(N)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE; //MINUS INFINITY
        for(int i = 0; i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
                //max = Math.max(max, list.get(i));
            }
        }
        System.out.println("Max element is: " + max); //9

    }
}
