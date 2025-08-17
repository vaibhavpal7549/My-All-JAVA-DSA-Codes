
class trap_water_bruteforce {
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0; // Edge case
        
        int totalWater = 0;

        for (int i = 0; i < n; i++) {
            int leftMax = 0, rightMax = 0;

            // Find max height to the left of i
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            // Find max height to the right of i
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            // Calculate water trapped at index i
            totalWater += Math.min(leftMax, rightMax) - height[i];
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Rainwater: " + trap(height));
    }
}