class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int i = 0;
        int j = height.length-1;
    
        while (i != j) {
            int area = Math.min(height[i], height[j]) * (j-i); 
            if (max < area) {
                max = area;
            }

            if (height[i] > height[j]) {
                j--;
            }

            else {
                i++;
            }
        }

        return max;
    }
}