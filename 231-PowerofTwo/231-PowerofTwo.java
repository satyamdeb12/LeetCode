class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0; i<=30; i++) {
            int poweredInt = (int) Math.pow(2,i);
            if(n==poweredInt) {
                return true;
            }
        }
        return false;
    }
}
1
