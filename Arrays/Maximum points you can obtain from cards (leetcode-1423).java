class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0;
        int r=0;
        int max=0;
        int n=cardPoints.length;
        int rightind=n-1;
        for (int i=0;i<k;i++){
            l+=cardPoints[i];
        }
        max=l;
        for (int i=k-1;i>=0;i--)
        {
            l-=cardPoints[i];
            r+=cardPoints[rightind];
            rightind-=1;
            max=Math.max(max,l+r);
        }
        return max;
    }
}