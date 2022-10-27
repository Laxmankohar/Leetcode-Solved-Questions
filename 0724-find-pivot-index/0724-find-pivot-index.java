class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, lsum = 0;
        
        for(int i : nums){
            sum += i;
        }
        
        for(int i = 0; i<nums.length;i++){
             
            if(lsum == sum - lsum - nums[i]){
                return i;
            }
            
            lsum += nums[i];
        }
        return -1;
    }
}