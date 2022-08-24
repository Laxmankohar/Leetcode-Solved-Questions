class Solution {
    public String truncateSentence(String s, int k) {
        String [] str = s.split(" ");
        
        String ans = str[0];
        
        for(int i = 1; i<k; i++){
            ans = ans +" "+str[i];
        }
        return ans;
    }
}