class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int n=nums.length;
        int ngr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ngr[i]=-1;
        }
        for(int i=2*nums.length-1;i>=0;i--){
            while(!s.isEmpty()&&nums[s.peek()]<=nums[i%n]){
                s.pop();
            }
            if(!s.isEmpty()){
                ngr[i%n]=nums[s.peek()];
            }
            s.push(i%n);
        }
        return ngr;
    }
}