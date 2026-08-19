class Solution {
    public boolean isPalindrome(String s) {
        int x = 0;
        int y = s.length() - 1;
        
        while(x < y){

            while(x < y && !isAlphaNum(s.charAt(x))){
                x ++;
            }

            while(y > x && !isAlphaNum(s.charAt(y))){
                y --;
            }

            if(Character.toLowerCase(s.charAt(x)) != Character.toLowerCase(s.charAt(y)))
                return false;
            x ++;
            y --;

        }
        return true;
    }

    public boolean isAlphaNum(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c<= '9'))
            return true;
        return false;
    }
}
