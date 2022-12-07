class Solution {
    public boolean isPalindrome(int x) {
        
        
        int reversed = 0;
        int original = x;
        int digit = 0;
        while (x >= 1) {
            digit = x % 10;
            x /= 10;
            reversed = reversed*10 + digit;
        }
        return original == reversed;
    
    }
}