// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length ;
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i = 0 ; i < n ; i++){
//             currSum += nums[i];
//             if(currSum > maxSum ){
//                 maxSum = currSum;
//             }
//             if(currSum < 0){
//                 currSum = 0 ;
//             }
//         }
//         return maxSum;
//     }
// }


class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length ;
        int currMax = nums[0];
        int maxSum = nums[0];
        for(int i = 1 ; i < n ; i++){
           currMax = Math.max(currMax + nums[i] , nums[i]);
           maxSum = Math.max(maxSum , currMax);
        }
        return maxSum;
    }
}