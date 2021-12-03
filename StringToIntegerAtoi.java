class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int answer=0;
        boolean isNegative=false;
        if('-'==s.charAt(0) || '+'==s.charAt(0)) {
            if('-'==s.charAt(0)) isNegative = true;
            s=s.substring(1,s.length());
            }
        if(s.length()==0) return 0;
        int firstChar=(int)s.charAt(0);
        if(firstChar>57 || firstChar<48) return 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int c=ch;
            if(c>57 || c<48) break;
            int lastDigit = ch-48;
            if(answer != Integer.MAX_VALUE / 10){
                if (!isNegative && answer > Integer.MAX_VALUE / 10) return 2147483647;
                if (isNegative && answer*-1 < Integer.MIN_VALUE / 10) return -2147483648;
            }
            else{
                if (!isNegative && lastDigit>=7) return 2147483647;
                if (isNegative && lastDigit>=8) return -2147483648;
            }
            answer=answer*10+lastDigit;
        }
        if(isNegative) return answer*-1;
        return answer;
    }
}