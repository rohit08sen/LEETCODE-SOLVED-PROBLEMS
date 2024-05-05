class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        int nsr[]=new int[heights.length];
        int nsl[]=new int[heights.length];
        //for next smaller right
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=heights.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //for next smaller left
        s=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty()&&heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //Area calculation
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;

    }
}