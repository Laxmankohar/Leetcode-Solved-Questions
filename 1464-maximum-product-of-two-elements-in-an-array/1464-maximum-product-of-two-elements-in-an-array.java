class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int secMax = 0;
        
        for(int i : nums){
            if(i > max){
                secMax = max;
                max = i;
            }
            else if(i > secMax){
                secMax = i;
            }
        }
        return (max-1)* (secMax-1);
    }
}