class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int dup = x;
        int rev = 0;
        while(x!=0){
            int lastdigit = x % 10;

            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                return false;
            }

            rev = rev * 10 + lastdigit;
            x = x / 10;
        }

        return dup == rev;
    }
}