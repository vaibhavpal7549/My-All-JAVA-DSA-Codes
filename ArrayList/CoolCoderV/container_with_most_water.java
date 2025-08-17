import java.util.*;
public class container_with_most_water {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        //brute force
        for(int i = 0; i<height.size(); i++){
            for(int j = i+1; j<height.size(); j++){
                int lineHeight = Math.min(height.get(i), height.get(j));
                int width = (j-i);
                int water = lineHeight * width;
                maxWater = Math.max(water, maxWater);
            }
        }
        return maxWater;


    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1 8 6 2 5 4 8 3 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int ans = storeWater(height);
        System.out.println("Most water is: " + ans + " units");
    }
}
