class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
         HashMap<Integer,Integer> hs = new HashMap();
        Stack<Integer> stack = new Stack();
        
        for(Integer num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                hs.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        for(int i=0;i<nums1.length;i++){
            nums1[i] = hs.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}