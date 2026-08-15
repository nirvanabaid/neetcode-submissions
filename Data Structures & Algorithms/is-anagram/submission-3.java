class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sHash = new HashMap<>();
        Map<Character, Integer> tHash = new HashMap<>();

        for (char c : s.toCharArray()){
            sHash.put(c , sHash.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()){
            tHash.put(c , tHash.getOrDefault(c, 0) + 1);
        }

        if(sHash.size() != tHash.size())
            return false;

        for (char c : sHash.keySet()){
            if(!sHash.get(c).equals(tHash.getOrDefault(c, 0)))
                return false;
        }
        return true;
    }
}
