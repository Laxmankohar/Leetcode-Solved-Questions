class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int i = 0, j= 0, max = 0;
        
        while(j < s.length()){
            
//             if character is not present, we add it to set and find max
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            }
            
//             if character is repeating , we remove from the set
            else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}