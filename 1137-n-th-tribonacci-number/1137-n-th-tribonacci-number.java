class Solution {
    
    int memo[];
    
    Solution(){
        memo = new int[38];
        memo[0]  = 0;
        memo[1] = 1;
        memo[2] = 1;
        
        for(int i = 3; i<memo.length;i++){
            memo[i] = -1;
        }
    }
    public int tribonacci(int n) {
        
        
        if(memo[n] != -1) return memo[n];
        else{
            int reslt = tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
            memo[n] = reslt;
                    return reslt;

            
        } 
            
    }
}