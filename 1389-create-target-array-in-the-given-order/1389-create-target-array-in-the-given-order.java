class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[] = new int[nums.length];
        
        for (int i = 0; i < nums.length; ++i) 
        {
            if (index[i] == i) 
            {
                arr[index[i]] = nums[i];
            }
            else 
            {  // index[i] < i
                int temp;
                for (int j = index[i]; j < i+1; ++j) 
                {
                    temp = arr[j];
                    arr[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        
        return arr;
    }
}