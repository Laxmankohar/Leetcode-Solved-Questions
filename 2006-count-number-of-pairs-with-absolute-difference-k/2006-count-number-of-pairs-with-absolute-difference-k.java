class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer, Integer>map = new HashMap<>();
        int count = 0;
        
        // for(int i = 0; i<nums.length;i++){
        //     for(int j = i; j<nums.length;j++){
        //         if(Math.abs(nums[i] - nums[j]) == k){
        //             count++;
        //         }
        //     }
        // }
        
        
//         Optimal approach
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
            count += map.getOrDefault(i-k, 0) + map.getOrDefault(i+k, 0);
        }
        return count;
    }
}