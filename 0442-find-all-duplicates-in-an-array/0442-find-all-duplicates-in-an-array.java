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
}