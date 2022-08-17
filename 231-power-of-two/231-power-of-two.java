class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 1) return n ==1;
        
        return n % 2== 0 && isPowerOfTwo(n /2) ;
    }
}