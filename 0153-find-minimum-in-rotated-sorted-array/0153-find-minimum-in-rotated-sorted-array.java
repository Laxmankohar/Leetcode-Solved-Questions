class Solution {
    public int findMin(int[] nums) {
        // int min = nums[0];
        // for(int i =0; i<nums.length;i++){
        //     if(nums[i] < min){
        //         min = nums[i];
        //     }
        // }
        // return min;
        
//         binary search
        
        int start = 0;
        int end = nums.length -1 ;
        
        if(nums.length == 1 || nums[end] > nums[start]){
            return nums[start];
        }
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if(nums[mid] > nums[mid+1]) return nums[mid+1];
            
            if(nums[mid] < nums[mid -1]) return nums[mid];
            
            if(nums[mid] > nums[0]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        
        return Integer.MAX_VALUE;
    }
}