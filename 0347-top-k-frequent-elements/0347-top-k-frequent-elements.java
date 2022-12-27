class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        
        int ans [] =  new int[k];
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
            
        for(int i = 0; i<k;i++){
            int max = 0;
            int key = 0;
        
            for(Integer x : map.keySet()){
                if(map.get(x) > max){
                    max = map.get(x);
                    key = x;
                }
                
            }
            ans[i] = key;
            map.remove(key);
            
        }
        return ans;
    }
}