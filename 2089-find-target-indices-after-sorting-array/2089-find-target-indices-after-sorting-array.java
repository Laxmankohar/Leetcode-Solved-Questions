class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        // for(int i = 0 ; i < nums.length; i++){
        //     if(nums[i] == target){
        //         list.add(i);
        //     }
        // }
        // return list;
        
        
        
        int start = 0;
        int end = nums.length -1 ;
        
        while(start < end){
            int mid = (start + end)/2;
             if(nums[mid] >= target){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        
        while(nums[start] == target){
            list.add(start);
            
            if(start != nums.length-1){
                start++;
            }
            else{
                break;
            }
        }
        
        return list;
    }
}