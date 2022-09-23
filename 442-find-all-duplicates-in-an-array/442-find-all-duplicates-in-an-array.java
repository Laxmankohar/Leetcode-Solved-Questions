class Solution {
    
    private void swap(int[] nums, int a, int b){
        int temp  = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    public List<Integer> findDuplicates(int[] nums) {
        
        int  i = 0;
        while(i < nums.length){
            int correctIndex = nums[i]-1;
            
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int j = 0; j<nums.length;j++){
            if(nums[j] != j+1){
                list.add(nums[j]);
            }
        }
        
        return list;
    }
    
    
}