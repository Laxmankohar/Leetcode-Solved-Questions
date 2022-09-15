class Solution {
    public int minBitFlips(int start, int goal) {
        int flipped = start^goal;         // since xor gives 1 only when bits are different
                                         // therefore, we only need to count occurence of 1

        
        int count = 0;
        
        while(flipped != 0){
            if((flipped & 1) == 1) count++;  // if no. is odd means[ last bit is 1] make count ++
            flipped >>= 1;  //remove the last bit 
        }
        return count;
    }
}