class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int copy=x;
        int i=0;
        Queue<Integer> q
            = new LinkedList<>();
        while(x>0){
            int y = x%10;
            x=x/10;
            System.out.println(""+y);
            q.add(y);
            i++;
        }
        int check=0;
        while(i!=0){
            int z =(int)q.remove();
            check = check + (int)Math.pow(10,i-1)*z;
            i--;
        }
        if(copy==check) return true;
        return false;
    }
}