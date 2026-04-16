// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int currentSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             currentSum += nums[i];

//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//         }
//         return maxSum;
//     }
// }



class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currMax = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < n; i++) {
           currMax = Math.max(currMax + nums[i] , nums[i]);
           maxSum = Math.max(maxSum , currMax);
        }
        return maxSum;
    }
}