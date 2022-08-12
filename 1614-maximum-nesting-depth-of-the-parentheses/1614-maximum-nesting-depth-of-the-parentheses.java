class Solution {
    public int maxDepth(String s) {
//         Stack<Character> st = new Stack<>();
        
//         int max =0;
        
//         for(char ch : s.toCharArray()){
//             if(ch == '('){
//                 st.push('(');
//                 max = Math.max(max, st.size());
//             }
//             else if(ch == ')'){
//                 st.pop();
//             }
//         }
//         return max;
        
        
        
        
        
        
        
        
        
//        without using stack 
        int count = 0;
        int max = 0;
        for(int i =0 ; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
                max = Math.max(max, count);
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return max;
    }
}