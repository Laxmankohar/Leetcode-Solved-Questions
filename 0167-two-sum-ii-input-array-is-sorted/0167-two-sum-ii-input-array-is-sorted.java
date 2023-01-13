class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        
        while(high > low){
            if(numbers[high] + numbers[low] == target){
                return new int[]{low + 1, high + 1};
            }
            
            if(numbers[high] + numbers[low] < target)
                low++;
            else
                high--;
        }
        
            return numbers;
    }
    
}