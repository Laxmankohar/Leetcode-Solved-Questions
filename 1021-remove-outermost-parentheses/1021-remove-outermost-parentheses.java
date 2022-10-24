class Solution {
    public String removeOuterParentheses(String s) {
                
        
        StringBuilder s1 = new StringBuilder();
        
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && opened++ > 0) s1.append(c);
            if (c == ')' && opened-- > 1) s1.append(c);
        }
        return s1.toString();
    }
}