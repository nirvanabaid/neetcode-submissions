class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < (len - 2)){
            j = i+1;
            k = len-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
                else if(sum > 0){
                    k--;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
                else{
                    j++;
                    while(j < k && nums[j] == nums[j-1]) j++;
                }
            }
            i++;
            while( i < (len-2) && nums[i] == nums[i-1]){
                i++;
            }
        }

        return res;
    }
}
