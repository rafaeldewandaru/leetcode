import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int k = i+1; k < nums.length; k++) {
                int complement = target - nums[k];

                if (map.containsKey(complement)) {
                    List<Integer> set = Arrays.asList(0-target, map.get(complement), nums[k]);
                    seen.add(set);
                }

                else {
                    map.put(nums[k], nums[k]);
                }
            } 
        }

        return new ArrayList<>(seen);
    }
}