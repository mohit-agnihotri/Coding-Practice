class Solution {
    public List<Integer> findDuplicates(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            List<Integer> duplicates = new ArrayList<>();

            for (int x : nums) {
                if (set.contains(x)) {
                    duplicates.add(x);
                } else {
                    set.add(x);
                }
            }
            return duplicates;
        }

    //     List<Integer> result = new ArrayList<>();

    //     for (int i = 0; i < nums.length; i++) {
    //         int index = Math.abs(nums[i])- 1;
    //         if (nums[index] < 0) {
    //             result.add(index + 1);
    //         } else {
    //             nums[index] = -nums[index];
    //         }
    //     }
    //     return result;
    // }
}