class Solution {
    public int maxArea(int[] height) {
        int n =height.length;
        int i=0;
        int j =n-1;
        int area=Integer.MIN_VALUE;
        while(i<j){
            int w=(j-i)*Math.min(height[i],height[j]);
            area=Math.max(area,w);
            if (height[i]<height[j])
            i++;
            else
            j--;
        }
        return area;
    }
}