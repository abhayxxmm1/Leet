class Solution {
    public boolean isPalindrome(int x) {
    //     if (x < 0 || (x % 10 == 0 && x != 0)) {
    //         return false;
    //     }

    //     int reverted = 0;
    //     while (x > reverted) {
    //         reverted = reverted * 10 + x % 10;
    //         x /= 10;
    //     }
    //     return x == reverted || x == reverted / 10;    

         int temp=x;
        int reverse=0;
        while(x>0){
            int l=x%10;
            reverse=reverse*10+l;
            x/=10;

        }
        if(temp==reverse){
            return true;
        }else{
            return false;
        }
    }

    
}