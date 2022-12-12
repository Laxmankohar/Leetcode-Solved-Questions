class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String sum = "";
        String sum2 = "";
        
        for(int i =0; i<word1.length; i++){
             sum += word1[i];
        }
        
        for(int i =0; i<word2.length; i++){
             sum2 += word2[i];
        }
        
        // return (sum.contains(sum2) && sum2.contains(sum));
        return (sum.equals(sum2));

                

        
    }
}