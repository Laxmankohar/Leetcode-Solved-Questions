class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        if(nums.length==1)
        {
            list.add(nums[0]);
            return list;
        }
        
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);  
            
        }
        
        for (Integer i : map.keySet())
        {
            if(map.get(i)>nums.length/3)
                list.add(i);
        }
        
        return list;
    }
}