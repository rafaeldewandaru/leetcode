import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length-1;

            while (left < right) {
                int sum =  nums[left] + nums[i] + nums[right];
                if (Math.abs(target-sum) < Math.abs(target-res)) {
                    res = sum;
                }

                if (sum < target) {
                    left++;
                }

                else {
                    right--;
                }

            }
        }

        return res;
        
    }
}