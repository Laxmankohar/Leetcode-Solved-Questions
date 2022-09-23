class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        
        
        List<Integer> list = new ArrayList<>();
        
        for(int j =0; j<nums.length;j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        
        return list;
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}