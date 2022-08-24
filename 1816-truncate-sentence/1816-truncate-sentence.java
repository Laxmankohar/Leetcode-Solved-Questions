class Solution {
    public String truncateSentence(String s, int k) {
//         String [] str = s.split(" ");
        
//         String ans = str[0];
        
//         for(int i = 1; i<k; i++){
//             ans = ans +" "+str[i];
//         }
//         return ans;
        
        
        
//         Better approach
        
        int count = 0;
        
        for(int i =0; i<s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
            
            if(count == k){
                return s.substring(0, i);
            }
        }
        return s;
    }
}