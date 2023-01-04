class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        int frst = map.get(s.charAt(0));
        
        for(char k : map.keySet()){
            if(map.get(k) != frst){
                return false;
            }
        }
        return true;
    }
}