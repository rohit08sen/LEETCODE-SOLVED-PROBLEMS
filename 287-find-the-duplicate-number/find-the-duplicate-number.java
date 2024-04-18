// class Solution {
//     public int findDuplicate(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int num=nums[j];
//                 if(num==nums[i]){
//                     return num;
//                 }
//             }
//         }
//        return -1;
//     }
// }


class Solution{
    public static int findDuplicate(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int i = 0; i < len; i++) {
            cnt[nums[i]]++;
            if (cnt[nums[i]] > 1) {
                return nums[i];
            }
        }

        return -1;
    }
}
