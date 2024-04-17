// class Solution {
//     public void moveZeroes(int[] nums) {

//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){

//                 for(int j=i;j<nums.length-1;j++){
//                     nums[j]=nums[j+1];
//                 }
//                 nums[nums.length-1]=0;
//             }
            
//         }
        
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                if (nonZeroIndex != i) {
                    nums[i] = 0;
                }
                nonZeroIndex++;
            }
        }
    }
}
