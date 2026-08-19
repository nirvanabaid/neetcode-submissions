class Solution {
    public int[] twoSum(int[] n, int t) {
        int l = 0;
        int r = n.length - 1;
        while(l < r){
            if((n[l] + n[r]) > t){
                r --;
                continue;
            }
            if((n[l] + n[r]) < t){
                l ++;
                continue;
            }
            int[] res = {l + 1,r + 1};
            return res;
        }
        int[] res = {0,0};
        return res;
    }
}
