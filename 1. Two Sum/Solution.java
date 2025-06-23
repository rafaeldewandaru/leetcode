import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> targetNum = new HashMap<>();
        for (int ii = 0; ii < nums.length; ii++) {
            targetNum.put(nums[ii], ii);
        }

        for (int jj = 0; jj < nums.length; jj++) {
            int complement = target - nums[jj];
            if (targetNum.containsKey(complement) && targetNum.get(complement) != jj) {
                return new int[] {jj,targetNum.get(complement)};
            }
        }

        return new int[]{};
    }
}