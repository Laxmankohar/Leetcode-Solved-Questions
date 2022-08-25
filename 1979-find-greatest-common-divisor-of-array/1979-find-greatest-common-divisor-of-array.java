class Solution {
    public int findGCD(int[] nums) {
        
        int maxx = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        
        for(int  i =0; i<nums.length;i++){
             maxx = Math.max(maxx, nums[i]);
             minn = Math.min(minn, nums[i]);

        }
        
        while(minn > 0) {
        int temp = minn;
        minn = maxx % minn;
        maxx = temp;
    }
    return maxx;
            
    }
}