class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        if(x<0) return false;
        while(x>0) {
            int rem = x%10;
            reverse = (reverse*10) + rem;
            x = x/10;
        }
        return original == reverse;
    }
}
121
