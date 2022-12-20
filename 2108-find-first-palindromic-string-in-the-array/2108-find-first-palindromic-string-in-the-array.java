class Solution {
    public String firstPalindrome(String[] words) {
        
        String rev = "";
        
        if(words.length == 0){
            return rev;
        }
        
        
        for(int i =0; i< words.length;i++){
            
            String si = words[i];
            StringBuffer b = new StringBuffer(si);
            b.reverse();
            
            String data = b.toString();
            
            if(si.equals(data)){
                
                return si;
            }
        }
        return rev;
    }
}