class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<int[]> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            l.add(new int[] {entry.getValue(), entry.getKey()});
        } 
        l.sort((a,b) -> Integer.compare(b[0], a[0]));
        
        for (int i = 0; i<k; i++){
            arr[i] = l.get(i)[1];
        }
        return arr;
    }
}