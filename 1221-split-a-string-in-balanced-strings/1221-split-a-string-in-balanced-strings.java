class Solution {
    public int balancedStringSplit(String s) {
        int lcount = 0, rcount = 0, balCount = 0;
        
        char arr[] = s.toCharArray();
        
        for(int i =0; i<s.length(); i++){
            if(arr[i] == 'L'){
                lcount++;
            }
            if(arr[i] == 'R'){
                rcount++;
            }
            
            if(lcount == rcount){
                balCount++;
            }
        }
        return balCount;
    }
}