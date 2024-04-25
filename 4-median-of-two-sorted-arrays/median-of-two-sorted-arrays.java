// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int l1=nums1.length;
//         int l2=nums2.length;
//         int mergedArray[]=new int[l1+l2];
//         int l=l1+l2;
//         merged(nums1,nums2,mergedArray);
//         if(l%2!=0){
//             return mergedArray[l/2];
//         }
//         else{
//             return mergedArray[(2*l-1)/2];
//         }
//     }
//     private void merged(int[] num1,int[] num2,int[] mergedArray){
//         int i=0,j=0,k=0;
//         int l1=num1.length;
//         int l2=num2.length;
//         while(i<=l1&&j<=l2){
//             if(num1[i]<num2[j]){
//                 mergedArray[k++]=num1[i++];
//             }
//             else{
//                 mergedArray[k++]=num2[j++];
//             }
//         }
//         if(i>l1){
//             while(j<=l2){
//                 mergedArray[k++]=num2[j++];
//             }
//         }
//         else{
//             while(i<=l1){
//                 mergedArray[k++]=num1[i++];
//             }
//         }
    
//     }
// }

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int mergedArrayLength = l1 + l2;
        int[] mergedArray = new int[mergedArrayLength];
        merge(nums1, nums2, mergedArray);
        if (mergedArrayLength % 2 != 0) {
            return mergedArray[mergedArrayLength / 2];
        } else {
            return (mergedArray[(mergedArrayLength - 1) / 2] + mergedArray[mergedArrayLength / 2]) / 2.0;
        }
    }

    private void merge(int[] nums1, int[] nums2, int[] mergedArray) {
        int i = 0, j = 0, k = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        while (i < l1 && j < l2) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < l1) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < l2) {
            mergedArray[k++] = nums2[j++];
        }
    }
}
