import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Double>> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            double curr = (double) target - nums[i];
            int[] arr = Arrays.copyOfRange(nums, i+1, nums.length);

            for (List<Double> set : threeSum(arr, curr)) {
                List<Double> newList = new ArrayList<>(set);
                newList.add((double) nums[i]);
                seen.add(newList);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (List<Double> list : seen) {
            List<Integer> intList = new ArrayList<>();
            for (Double d : list) {
                intList.add(d.intValue()); 
            }
            result.add(intList);
        }

        return result;
    }

    public List<List<Double>> threeSum(int[] nums, double target) {
        List<List<Double>> seen = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            Double search = target - nums[i];

            HashMap<Double, Double> map = new HashMap<>();

            for (int k = i+1; k < nums.length; k++) {
                double complement = search - nums[k];

                if (map.containsKey(complement)) {
                    List<Double> set = Arrays.asList((double) nums[i], map.get(complement), (double) nums[k]);
                    seen.add(set);
                }

                else {
                    map.put((double) nums[k], (double) nums[k]);
                }
            } 
        }

        return seen;
    }
}