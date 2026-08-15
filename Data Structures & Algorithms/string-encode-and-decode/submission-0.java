class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String s : strs){
            int l = s.length();
            System.out.println("s -> " + s + " - length -> " + l);
            res += Integer.toString(l) + '#' + s;
        }
        System.out.println("Res -> " + res);
        return res;
    }

    public List<String> decode(String str) {
        List<String> l = new ArrayList<>();
        int i = 0;
        
        while(i < str.length()){
            int d = str.indexOf("#", i);
            int n = Integer.parseInt(str.substring(i, d));
            int first = d + 1;
            int last = d + 1 + n;
            l.add(str.substring(first, last));
            i = last;
        }
        return l;

    }
}
