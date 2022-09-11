class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        //brute force
        // for(int i =0; i<nums.length;i++){
        //     for(int j = i+1; j<nums.length;j++){
        //         if(nums[i] == nums[j] && (Math.abs(i-j) <= k)){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        
        
        
        
        if (nums == null || nums.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}