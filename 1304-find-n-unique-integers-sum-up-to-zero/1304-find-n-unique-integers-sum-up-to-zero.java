class Solution {
    public int[] sumZero(int n) {
        int [] arr = new int[n];
        for (int i = 1;i <= n/2;i++){
            arr[i-1] = i;
            arr[n-i] = -i;
        }
        return arr;
    }
}