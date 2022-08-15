class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        // int ans [] =  new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums2){
            while(!st.isEmpty() && st.peek() < i){
                map.put(st.pop(), i);
            }
            st.push(i);
        }
        
        int i =0;
        
        for(;i<nums1.length;i++){
            nums1[i ]= map.getOrDefault(nums1[i], -1);
        }
        return nums1;
        
        
        
//         HashMap<Integer,Integer> hs = new HashMap();
//         Stack<Integer> stack = new Stack();
        
//         for(Integer num : nums2){
//             while(!stack.isEmpty() && stack.peek() < num){
//                 hs.put(stack.pop(), num);
//             }
//             stack.push(num);
//         }
        
//         for(int i=0;i<nums1.length;i++){
//             nums1[i] = hs.getOrDefault(nums1[i],-1);
//         }
//         return nums1;
    }
}