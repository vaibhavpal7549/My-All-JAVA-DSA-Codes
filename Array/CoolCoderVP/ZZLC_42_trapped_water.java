public class ZZLC_42_trapped_water {

    public static int trappedWater(int height[]){
        //calculate left max boundary array
        int n = height.length;
        int left[] = new int[n];
        left[0] = height[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }

        //calculate right max boundary array
        int right[] = new int[n];
        right[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i]);
        }

        int trappedWater = 0;
        //loop
        for(int i = 0; i<n; i++){
            // water_level = min(leftmax bound, right max bound)
            int water_level = Math.min(left[i], right[i]);

            // trapped water = water_level - height[i]
            trappedWater += water_level - height[i];
        }
        return trappedWater;


    }


    public static void main(String[] args) {
        int[] height = {1,8,0,2,3,4,5};
        System.out.print(trappedWater(height));
    }
}




// public class trappedWater {
//     public static int trap(int[] height) {
//         int left = 0, right = height.length - 1;
//         int leftMax = 0, rightMax = 0;
//         int water = 0;

//         while (left < right) {
//             if (height[left] < height[right]) {
//                 if (height[left] >= leftMax) {
//                     leftMax = height[left];
//                 } else {
//                     water += leftMax - height[left];
//                 }
//                 left++;
//             } else {
//                 if (height[right] >= rightMax) {
//                     rightMax = height[right];
//                 } else {
//                     water += rightMax - height[right];
//                 }
//                 right--;
//             }
//         }

//         return water;
//     }

//     public static void main(String[] args) {
//         int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//         System.out.println(trap(height)); // Output: 6
//     }
// }
