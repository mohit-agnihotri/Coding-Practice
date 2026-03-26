class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            if (set1.contains(x)) {
                result.add(x);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;

        for (int x : result) {
            ans[i++] = x;
        }

        return ans;
    }
}