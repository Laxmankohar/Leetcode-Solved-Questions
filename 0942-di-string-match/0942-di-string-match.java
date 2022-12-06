class Solution {
    public int[] diStringMatch(String s) {
        int  l =0;
        int h =s.length();
        
        int arr[] = new int[s.length()+1];
        
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                arr[i] = l++;
            }
            else{
                arr[i] = h--;
            }
        }
        arr[s.length()] = l;
        return arr;
    }
}