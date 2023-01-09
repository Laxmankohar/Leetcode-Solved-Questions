class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> ans = new HashSet<>();
        for(int i : nums){
            if(i >= original){
                ans.add(i);
            }
            
            while(true){
                if(ans.contains(original)){
                    original = 2 * original;
                }
                else{
                    break;
                }
            }
        }
        return original;
        
    }
}