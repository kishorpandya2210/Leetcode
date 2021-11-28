class Solution {
    public int reverse(int x) {
        if(x==0) return x;
        boolean isNegative=false;
        if(x<0){
            isNegative=true;
            x=x*-1;
        }
        int answer=0;
        while(x!=0){
            int lastDigit=x%10;
            if (answer > Integer.MAX_VALUE/10 || (answer == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
            if (answer < Integer.MIN_VALUE/10 || (answer == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;
            answer=answer*10+lastDigit;
            x=x/10;
        }
        if(isNegative) {
            try{answer=answer*-1;}
            catch(Exception e){
                return 0;
            }
            }
        // if(answer>Math.pow(2,31)-1 || answer<Math.pow(-2,31)) return 0;
        return answer;
    }
}