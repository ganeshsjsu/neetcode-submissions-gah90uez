class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        int left = 0;
        int right = n - 1;

        while(left < right) {
            int wid = right - left;
            int area = Math.min(heights[left],heights[right]) * wid;
            max = Math.max(max, area);

            if(heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return max;
    }
}
