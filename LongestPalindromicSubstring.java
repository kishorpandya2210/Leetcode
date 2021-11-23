class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0) return "";
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int len=Math.max(palindromeCheck(s,i,i),palindromeCheck(s,i,i+1));
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    private int palindromeCheck(String s,int L,int R){
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}