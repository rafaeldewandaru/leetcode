public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // int[] arr = {1,0,-1,0,-2,2};
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        // int target = -2147483648;
        System.out.println(solution.fourSum(arr, target));
    }
}
