class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> uniqueNums = new ArrayList<>();
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int x = nums[i];
            int y = nums[j];
            if (!uniqueNums.contains(x)){
                uniqueNums.add(x);
            }
            else
                return true;
            if(!uniqueNums.contains(y)){
                uniqueNums.add(y);
            }
            else 
                return true;
            
            i++;
            j--;
        }
        return false;
    }
}