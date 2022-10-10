class Solution {
    public int findMin(int[] nums) {
//         int min = nums[0];
        
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] < min){
//                 min = nums[i];
//             }
//         }
//         return min;
        
        
//         binary search
        
        int start = 0;
        int end = nums.length -1;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            // When right half is sorted
            if (nums[mid] < nums[end])
                end = mid; // Bcoz mid can be our min value
            // When left half is sorted
            else if (nums[mid] > nums[end])
                start = mid + 1;
            // When can't determine which half is sorted
            else
                end--;
        }
        return nums[end]; // or nums[start] as both start and end will point to same

    }
}