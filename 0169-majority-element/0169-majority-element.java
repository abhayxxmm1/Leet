// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         int store=0;
//         for(int i=0; i<n; i++){
//         int ct=0;
//             for(int j=0; j<n; j++){

//                 if(nums[i]==nums[j]) {
//                     ct++;
//             }
//             if(ct>n/2){
//                 store=nums[i];
//                 break;
//             }
//         }
//     }
//         return store;
// }}

class Solution {
    public int majorityElement(int[] nums) {
        
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}