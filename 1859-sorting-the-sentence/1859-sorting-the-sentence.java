class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        
        HashMap<Integer, String> map = new HashMap<>();
        
        for(String st : arr){
            int n = Integer.valueOf(st.substring(st.length()-1));
            map.put(n, st.substring(0,st.length()-1)); 
        }
        
        String ans = "";
         for(int i : map.keySet()){
             ans += map.get(i);
             ans += " ";
         }
                    
        return ans.substring(0, ans.length()-1);
    }
}