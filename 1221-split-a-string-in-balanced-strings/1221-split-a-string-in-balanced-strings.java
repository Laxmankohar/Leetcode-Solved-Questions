class Solution {
    public int balancedStringSplit(String s) {
        int count = 0,balcount = 0;
        
        char arr[] = s.toCharArray();
        
        for(int i = 0; i<s.length(); i++){
            if(arr[i] == 'L'){
                count++;
            }
            else{
                count--;
            }
            
            if(count == 0){
                balcount++;
            }
        }
        return balcount;
    }
}