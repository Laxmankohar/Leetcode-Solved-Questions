class Solution {
    public int countAsterisks(String s) {
        int ans = 0;
        int rod = 0;
        
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '*' && rod % 2 == 0){
                ans++;
            }
            
            if(s.charAt(i) == '|'){
                rod++;
            }
            
        }
        return ans;
    }
}