class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9) {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
            if(i==0){
                int[] newdigits = new int[digits.length+1];
                newdigits[0]=1;
                for(int j=1;j<newdigits.length;j++){
                    newdigits[j]=digits[j-1];
                }
                return newdigits;
            }
        }
        return null;
    }
}