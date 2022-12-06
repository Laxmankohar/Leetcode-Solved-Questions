class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map =  new HashMap<>();
        
        
        for(int i = 0; i<s.length(); i++){
            char s1 = s.charAt(i);
            
            if(map.containsKey(s1)){
    
                map.put(s1, map.getOrDefault(s1,0)+1);
            
            }
            else{
                map.put(s1, 1);
                
            }
        }
        
        for(int i = 0; i<s.length();i++){
            
            char s2 = s.charAt(i);
            if(map.get(s2) == 1){
                return i;
            }
        
        }
        
       
        
        return -1;
        
    }
}