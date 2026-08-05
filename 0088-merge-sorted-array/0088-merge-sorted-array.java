class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int dup []=new int[m+n];
        int i=0,j=0,id=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                dup[id++]=nums1[i++];
            }
            else if(nums1[i] > nums2[j]){
                dup[id++]=nums2[j++];
                
            }

        }
        while(i<m){
            dup[id]=nums1[i];
            i++;
            id++;
        }
        while(j<n){
            dup[id]=nums2[j];
            j++;
            id++;
        }
        for (int x = 0; x < m + n; x++) {
            nums1[x] = dup[x];
        }
    }
}