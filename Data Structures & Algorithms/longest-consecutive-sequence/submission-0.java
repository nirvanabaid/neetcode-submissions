class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        }
        
        int res = 0;
        for (int n : s) {
            if (!s.contains(n - 1)) {
                int x = 1;
                while (s.contains(n + x)) {
                    x++;
                }
                res = Math.max(res, x);
            }
        }
        return res;
    }
}