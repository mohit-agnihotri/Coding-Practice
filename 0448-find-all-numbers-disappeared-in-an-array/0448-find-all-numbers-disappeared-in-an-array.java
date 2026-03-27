class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}