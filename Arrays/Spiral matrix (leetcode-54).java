class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        while(left<=right && top<=bottom){
            //left to right
            for (int i=left;i<=right;i++)
            res.add(matrix[top][i]);
            top++;

            //top to bottom
            for(int i=top;i<=bottom;i++)
            res.add(matrix[i][right]);
            right--;

            //right to left
            if (top <= bottom) {
            for(int i=right;i>=left;i--)
            res.add(matrix[bottom][i]);
            bottom--;
            }

            //bottom to top
              if (left <= right) {
            for (int i=bottom;i>=top;i--)
            res.add(matrix[i][left]);
            left++;
              }

        }
        return res;
    }
}