class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append("#").append(s);
        }
        System.out.println("Res -> " + res);
        return res.toString();
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
