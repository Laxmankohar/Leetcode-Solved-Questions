class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Set<Integer> ans = new HashSet<>();
        for(int i : arr){
            if(ans.contains(2*i) || (i%2==0 && ans.contains(i/2))){
                return true;
            }
            ans.add(i);
        }
        return false;
        
    }
}