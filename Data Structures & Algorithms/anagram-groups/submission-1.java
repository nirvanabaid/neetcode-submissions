class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<>();
       int rc = 0;
       Map<String, Integer> unique_anagrams = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            Integer i = unique_anagrams.get(s);
            if(i != null){
                res.get(i).add(str);
                continue;
            }
            List<String> newList = new ArrayList<>();
            newList.add(str);
            res.add(newList);
            unique_anagrams.put(s, rc++);
        }

        return res;
    }
}
