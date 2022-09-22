class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i= 0, j = 0, k=0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
                
            }
            else{
                nums1[k++] = nums1[i];
                ++i;
                ++j;
            }
        }
        int ans[] = new int[k];
        for(int b =0; b<k; b++){
            ans[b] = nums1[b];
        }
        return ans;
    }
}